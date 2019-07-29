package com.mtsvetkov.springrestclientexamples.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ReastTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplate){

        return restTemplate.build();
    }

}
