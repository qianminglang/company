package com.clear;

import com.clear.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/9 16:01
 * Version 1.0
 **/
@RestController
public class HelloController {

    @Resource
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.hello(name);
    }
}