package com.clear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/16 16:26
 * Version 1.0
 **/
@RestController
public class HelloController {
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForObject("http://nacos/hello", String.class);
    }

}