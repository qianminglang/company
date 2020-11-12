package com.clear.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName RabbitTopicConfig
 *
 * @author qml
 * Date 2020/11/12 16:09
 * Version 1.0
 **/
@Configuration
public class RabbitTopicConfig {
    public static final String TOPICNAME = "sang-topic";

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(TOPICNAME, true, false);
    }

    @Bean
    public Queue xiaomi() {
        return new Queue("xiaomi");
    }

    @Bean
    public Queue huawei() {
        return new Queue("huawei");
    }

    @Bean
    public Queue phone() {
        return new Queue("phone");
    }

    @Bean
    public Binding xiaomiBinding() {
        return BindingBuilder.bind(xiaomi())
                .to(topicExchange())
                .with("xiaomi.#");
    }

    @Bean
    public Binding huaweiBinding() {
        return BindingBuilder.bind(huawei())
                .to(topicExchange())
                .with("huawei.#");
    }

    @Bean
    public Binding phoneBinding() {
        return BindingBuilder.bind(phone())
                .to(topicExchange())
                .with("#.phone.#");
    }
}