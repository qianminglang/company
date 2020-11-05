package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName RestTemplateMain
 *
 * @author qml
 * Date 2020/11/5 15:19
 * Version 1.0
 **/
@SpringBootApplication
public class RestTemplateMain {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateMain.class, args);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}