package com.clear.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * ClassName DirectReceiver
 *
 * @author qml
 * Date 2020/12/30 16:27
 * Version 1.0
 **/
@Component
@RabbitListener(queues = "testDirectQueue")
public class DirectReceiverOne {
    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("DirectReceiverOne接受到的消息是："+testMessage.toString());
    }
}