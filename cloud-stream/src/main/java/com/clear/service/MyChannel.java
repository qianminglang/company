package com.clear.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * ClassName Mychannel
 *
 * @author qml
 * Date 2020/11/12 18:19
 * Version 1.0
 **/

public interface MyChannel {
    String INPUT = "mychannel-input";
    String OUTPUT = "mychannel-output";

    @Input(INPUT)
    SubscribableChannel input();

    @Output(OUTPUT)
    MessageChannel output();
}