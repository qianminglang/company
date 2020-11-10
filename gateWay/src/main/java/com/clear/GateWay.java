package com.clear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName GateWay
 *
 * @author qml
 * Date 2020/11/10 15:43
 * Version 1.0
 **/
@SpringBootApplication
public class GateWay {
    public static void main(String[] args) {
        SpringApplication.run(GateWay.class, args);
    }

//    编码配置路由
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route", r -> r.path("/get")
//                        .uri("http://httpbin.org"))
//                .build();
//    }
}