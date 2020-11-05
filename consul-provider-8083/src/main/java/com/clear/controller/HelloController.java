package com.clear.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/4 17:49
 * Version 1.0
 **/
@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello consul";
    }
}