package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName EurakaConsumer
 *
 * @author qml
 * Date 2020/11/5 11:48
 * Version 1.0
 **/
@SpringBootApplication
public class EurekaConsumer8087 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer8087.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate loadBalancer() {
        return new RestTemplate();
    }
}