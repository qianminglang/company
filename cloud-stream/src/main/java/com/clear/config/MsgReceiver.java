package com.clear.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * ClassName test
 *
 * @author qml
 * Date 2020/11/12 18:10
 * Version 1.0
 **/

@EnableBinding(Sink.class)
public class MsgReceiver {
    @StreamListener(Sink.INPUT)
    public void receive(Object playload) {
        System.out.println("Received:" + playload);
    }
}
