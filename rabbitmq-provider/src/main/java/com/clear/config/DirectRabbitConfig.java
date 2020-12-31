package com.clear.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * ClassName DirectRabbitConfig
 *
 * @author qml
 * Date 2020/12/30 15:41
 * Version 1.0
 **/
@Configuration
public class DirectRabbitConfig {
    public static final String TEST_DIRECT_QUEUE = "testDirectQueue";
    public static final String TEST_DIRECT_EXCHANGE = "testDirectExchange";
    public static final String TEST_DIRECT_ROUTING = "testDirectRouting";

    /**
     * 队列
     *
     * @param
     * @return org.springframework.amqp.core.Queue
     * @author qml
     * @date 2020/12/30 15:45
     **/
    @Bean
    public Queue testDirectQueue() {
        return new Queue(TEST_DIRECT_QUEUE, true);
    }

    /**
     * direct交换机
     *
     * @param
     * @return org.springframework.amqp.core.DirectExchange
     * @author qml
     * @date 2020/12/30 15:46
     **/
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(TEST_DIRECT_EXCHANGE, true, false);
    }

    /**
     * 将队列和交换机绑定
     *
     * @param
     * @return org.springframework.amqp.core.Binding
     * @author qml
     * @date 2020/12/30 15:53
     **/
    @Bean
    public Binding binding() {
        return BindingBuilder.bind(testDirectQueue()).to(directExchange()).with(TEST_DIRECT_ROUTING);
    }
}