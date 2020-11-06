package com.clear.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName UseHelloController
 *
 * @author qml
 * Date 2020/11/5 11:54
 * Version 1.0
 **/
@RestController
@Slf4j
public class UseHelloController {
    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    @Qualifier("loadBalancer")
    private RestTemplate loadBalancer;

    int count = 0;

    @GetMapping("/hello")
    public String hello(String name) {
        String s = loadBalancer.getForObject("http://provider/hello?name={1}", String.class, name);
        return s;
    }
}