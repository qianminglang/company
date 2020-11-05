package com.clear.controller;

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
public class HelloController {
    @RequestMapping("/hello")
    private String hell(String name) {
        return "hello" + name;
    }
}