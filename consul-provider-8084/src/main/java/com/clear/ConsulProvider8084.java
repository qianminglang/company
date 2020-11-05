package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName ConsulProvider8084
 *
 * @author qml
 * Date 2020/11/5 9:30
 * Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProvider8084 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProvider8084.class, args);
    }
}