package com.clear.rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * ClassName DelayChannel
 *
 * @author qml
 * Date 2020/11/13 14:59
 * Version 1.0
 **/

public interface DelayChannel {
    String INPUT = "delay_input_channel";
    String OUTPUT = "delay_output_channel";

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}