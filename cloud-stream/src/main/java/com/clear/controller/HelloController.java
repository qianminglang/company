package com.clear.controller;

import com.clear.service.MyChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/12 18:28
 * Version 1.0
 **/
@RestController
public class HelloController {
    @Resource
    MyChannel myChannel;

    @GetMapping("/hello")
    public void hello() {
        System.out.println("进入接口");
        myChannel.output().send(MessageBuilder.withPayload("hello stream!").build());
    }

}