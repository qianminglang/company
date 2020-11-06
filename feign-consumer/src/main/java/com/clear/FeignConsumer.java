package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName FeignConsumer
 *
 * @author qml
 * Date 2020/11/5 17:46
 * Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignConsumer {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer.class, args);
    }
}