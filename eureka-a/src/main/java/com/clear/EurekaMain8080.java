package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName EurakaMain8080
 *
 * @author qml
 * Date 2020/11/4 15:37
 * Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain8080.class,args);
    }
}