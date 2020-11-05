package com.clear.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

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
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(String name) {
        List<ServiceInstance> instances = discoveryClient.getInstances("provider");
        ServiceInstance serviceInstance = instances.get(0);
        URI uri = serviceInstance.getUri();
        log.info("调用的地址是："+uri);
        String result = restTemplate.getForObject(uri.toString() + "/hello?name={1}", String.class, name);
        return result;
    }
}