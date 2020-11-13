package com.clear.config;

import com.clear.service.MyChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * ClassName MsgReceiver2
 *
 * @author qml
 * Date 2020/11/12 18:25
 * Version 1.0
 **/
@EnableBinding(MyChannel.class)
public class MsgReceiver2 {
    @StreamListener(MyChannel.INPUT)
    public void receive(Object playload) {
        System.out.println("Received2:" + playload);
    }
}