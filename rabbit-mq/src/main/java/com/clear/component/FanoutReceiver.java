package com.clear.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName FanoutReceiver
 *
 * @author qml
 * Date 2020/11/12 16:03
 * Version 1.0
 **/
@Component
public class FanoutReceiver {
    @RabbitListener(queues = "queue-one")
    public void handler1(String message){
        System.out.println("FanoutReceiver:queue-one"+message);
    }

    @RabbitListener(queues = "queue-two")
    public void handler2(String message){
        System.out.println("FanoutReceiver:queue-two"+message);
    }

}