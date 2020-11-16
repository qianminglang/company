package com.clear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/16 9:55
 * Version 1.0
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(String name) {
        return "hello " + name;
    }
}