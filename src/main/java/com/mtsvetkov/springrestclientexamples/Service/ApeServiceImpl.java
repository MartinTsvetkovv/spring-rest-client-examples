package com.mtsvetkov.springrestclientexamples.Service;

import com.mtsvetkov.springrestclientexamples.domain.entities.User;
import com.mtsvetkov.springrestclientexamples.domain.entities.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApeServiceImpl implements ApiService{

    private final RestTemplate restTemplate;

    private final String api_url;

    @Autowired
    public ApeServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }


    @Override
    public List<User> getUsers(Integer limit) {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(api_url).queryParam("limit", limit);

        UserData userData = this.restTemplate
                .getForObject(uriComponentsBuilder.toString(), UserData.class);
        if (userData == null){
            throw  new IllegalArgumentException("Some problem");
        }
        return userData.getData();
    }
}
