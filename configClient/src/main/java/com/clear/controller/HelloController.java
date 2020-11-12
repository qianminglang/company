package com.clear.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/11 11:38
 * Version 1.0
 **/
@RestController
//@RefreshScope
public class HelloController {
    @Value("${javaboy}")
    private String hello;

    @GetMapping("/hello")
    private String hello() {
        return hello;
    }
}