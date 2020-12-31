package com.clear.config;

import com.clear.rabbit.DelayChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import java.util.Date;

/**
 * ClassName DelayMessageRecevier
 *
 * @author qml
 * Date 2020/11/13 15:03
 * Version 1.0
 **/
@EnableBinding(DelayChannel.class)
public class DelayMessageReceiver {

    @StreamListener(DelayChannel.INPUT)
    public void receiver(String message) {
        System.out.println("receive:" + message + ">>>" + new Date());
    }
}