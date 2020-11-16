package com.clear.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/16 15:37
 * Version 1.0
 **/
@RestController
@RefreshScope
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${server.port}")
    Integer port;

    @GetMapping("/hello")
    public String hello() {
        return "hello " + name + ">>>" + port;
    }
}