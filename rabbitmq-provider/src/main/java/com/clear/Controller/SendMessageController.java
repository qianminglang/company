package com.clear.Controller;

import com.clear.config.DirectRabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.UUID;

/**
 * ClassName SendMessageController
 *
 * @author qml
 * Date 2020/12/30 15:53
 * Version 1.0
 **/
@RestController
public class SendMessageController {
    @Resource
    RabbitTemplate rabbitTemplate;


    @GetMapping("/sendMessage")
    public String sendMessage() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "test message, hello!";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        HashMap<String, Object> hashMap = new HashMap<>(3);
        hashMap.put("messageId", messageId);
        hashMap.put("messageData", messageData);
        hashMap.put("createTime", createTime);
        rabbitTemplate.convertAndSend(DirectRabbitConfig.TEST_DIRECT_EXCHANGE,DirectRabbitConfig.TEST_DIRECT_ROUTING,hashMap);
        return "ok";
    }
}