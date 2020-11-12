package com.clear.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * ClassName RabbitDirectConfig
 *
 * @author qml
 * Date 2020/11/12 14:42
 * Version 1.0
 **/
@Configuration
public class RabbitDirectConfig {
    private static final String DIRECTNAME = "sang-direct";

    @Bean
    public Queue queue() {
        return new Queue("hello-queue");
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(DIRECTNAME, true, false);
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue())
                .to(directExchange())
                .with("direct");
    }
}