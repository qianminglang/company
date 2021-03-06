package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName ConsulMain
 *
 * @author qml
 * Date 2020/11/4 17:45
 * Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProvider8083 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProvider8083.class, args);
    }
}