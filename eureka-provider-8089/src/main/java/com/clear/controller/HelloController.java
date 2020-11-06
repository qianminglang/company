package com.clear.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/5 11:37
 * Version 1.0
 **/
@RestController
@Slf4j
public class HelloController {
    @Value("${server.port}")
    Integer port;

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello "+name+":"+port;
    }
}