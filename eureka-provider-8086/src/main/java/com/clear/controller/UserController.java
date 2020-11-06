package com.clear.controller;

import com.clear.dto.input.User;
import com.clear.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName UserController
 *
 * @author qml
 * Date 2020/11/6 9:38
 * Version 1.0
 **/
@RestController
@Slf4j
public class UserController implements HelloService {

    @Value("${server.port}")
    Integer port;

    @Override
    public String hello(String name) {
        return "hello " + name + ":" + port;
    }

    @Override
    public void delete(@PathVariable Long id) {

        log.info("删除的id为：" + id);
    }

    @Override
    public User getUser(@RequestParam String name) {
        User user = new User();
        user.setUsername(name);
        return user;
    }

    @Override
    public User addUser(@RequestBody User user) {
        return user;
    }

    @Override
    public void updateUserById(@RequestHeader String name, @RequestHeader Long id) {
        log.info("用户名：" + name + ", id:" + id);
    }
}