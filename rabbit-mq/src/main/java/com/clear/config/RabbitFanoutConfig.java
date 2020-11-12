package com.clear.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName RabbitFanoutConfig
 *
 * @author qml
 * Date 2020/11/12 15:51
 * Version 1.0
 **/
@Configuration
public class RabbitFanoutConfig {
    public static final String FANOUTNAME = "sang-fanout";

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(FANOUTNAME, true, false);
    }

    @Bean
    public Queue queueOne() {
        return new Queue("queue-one");
    }

    @Bean
    public Queue queueTwo() {
        return new Queue("queue-two");
    }

    @Bean
    public Binding bindingOne() {
        return BindingBuilder.bind(queueOne())
                .to(fanoutExchange());
    }

    @Bean
    public Binding bindingTwo() {
        return BindingBuilder.bind(queueTwo())
                .to(fanoutExchange());
    }
}