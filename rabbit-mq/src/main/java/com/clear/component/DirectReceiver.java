package com.clear.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName DirectReceiver
 *
 * @author qml
 * Date 2020/11/12 14:53
 * Version 1.0
 **/
@Component
public class DirectReceiver {
    @RabbitListener(queues = "hello-queue")
    public void handler(String message) {
        System.out.println("directReceiver:================>" + message);
    }
}