package com.clear.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName TopicReceiver
 *
 * @author qml
 * Date 2020/11/12 16:16
 * Version 1.0
 **/
@Component
public class TopicReceiver {

    @RabbitListener(queues = "phone")
    public void handler1(String message) {
        System.out.println("PhoneReceiver:" + message);
    }

    @RabbitListener(queues = "xiaomi")
    public void handler2(String message) {
        System.out.println("xiaomiReceiver:" + message);
    }

    @RabbitListener(queues = "huawei")
    public void handler3(String message) {
        System.out.println("huaweiReceiver:" + message);
    }
}