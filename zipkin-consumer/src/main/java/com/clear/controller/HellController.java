package com.clear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName HellController
 *
 * @author qml
 * Date 2020/11/16 10:16
 * Version 1.0
 **/
@RestController
public class HellController {

    @Resource
    RestTemplate restTemplate;

    @GetMapping("/sayHello")
    public void hello() {
        String javaboy = restTemplate.getForObject("http://localhost:7002/hello?name={1}", String.class, "javaboy");
        System.out.println(javaboy);
    }
}