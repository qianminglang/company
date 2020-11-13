package com.clear.controller;

import com.clear.rabbit.DelayChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * ClassName DelayMessageController
 *
 * @author qml
 * Date 2020/11/13 15:08
 * Version 1.0
 **/
@RestController
public class DelayMessageController {
    @Resource
    DelayChannel delayChannel;

    @GetMapping("/delay")
    public void delay(){
        System.out.println("message send:"+new Date());
        delayChannel.output().send(MessageBuilder.withPayload("delay message!").setHeader("x-delay",3000).build());
    }
}