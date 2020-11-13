package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ClassName SpringCloudSleuthApplication
 *
 * @author qml
 * Date 2020/11/13 16:29
 * Version 1.0
 **/
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class SpringCloudSleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSleuthApplication.class, args);
    }
}