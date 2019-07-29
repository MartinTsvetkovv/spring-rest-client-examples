package com.mtsvetkov.springrestclientexamples.controllers;

import com.mtsvetkov.springrestclientexamples.Service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
public class UserController {
    private final ApiService apiService;

    @Autowired
    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping("/users")
    public ModelAndView formData(ModelAndView modelAndView, ServerWebExchange serverWebExchange) {
        MultiValueMap<String, String> formData = serverWebExchange.getFormData().block();

        Integer limit = Integer.valueOf(formData.get("limit").get(0));
        log.debug("Receive Limit value" + limit);

        modelAndView.setViewName("userList");
        modelAndView.addObject("users", this.apiService.getUsers(limit));

        return modelAndView;
    }


}
