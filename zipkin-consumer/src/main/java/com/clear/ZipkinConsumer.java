package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName ZipkinConsumer
 *
 * @author qml
 * Date 2020/11/16 9:58
 * Version 1.0
 **/
@SpringBootApplication
public class ZipkinConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinConsumer.class, args);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}