package com.clear.rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * ClassName RegChannel
 *
 * @author qml
 * Date 2020/11/13 11:50
 * Version 1.0
 **/

public interface RegChannel {
    String INPUT = "reg-input-channel";
    String OUTPUT = "reg-output-channel";

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}