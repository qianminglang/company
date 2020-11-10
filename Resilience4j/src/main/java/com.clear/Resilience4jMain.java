package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName Resilience4jMain
 *
 * @author qml
 * Date 2020/11/9 15:50
 * Version 1.0
 **/
@SpringBootApplication
public class Resilience4jMain {
    public static void main(String[] args) {
        SpringApplication.run(Resilience4jMain.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}