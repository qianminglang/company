package com.clear.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/5 9:34
 * Version 1.0
 **/
@RestController
public class HelloController {
    @Value("${server.port}")
    Integer port;

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello "+name+":"+port;
    }
}