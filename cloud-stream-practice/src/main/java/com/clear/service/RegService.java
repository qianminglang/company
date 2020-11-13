package com.clear.service;

import com.clear.rabbit.RegChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName RegService
 *
 * @author qml
 * Date 2020/11/13 11:49
 * Version 1.0
 **/
@Service
public class RegService {
    @Resource
    RegChannel regChannel;

    public Map<String, Object> doReg(String email, String phone, String password) {
        Map<String, Object> map = new HashMap<>(3);
        map.put("email", email);
        map.put("phone", phone);
        regChannel.output().send(MessageBuilder.withPayload(map).build());
        map.put("message", "验证短信已发送,请注意查收！");
        return map;
    }
}