package com.clear.controller;

import com.clear.dto.input.User;
import lombok.extern.slf4j.Slf4j;
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
public class UserController {
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        log.info("删除的id为：" + id);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam String name) {
        User user = new User();
        user.setUsername(name);
        return user;
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return user;
    }

    @PutMapping("/updateUserById")
    public void updateUserById(@RequestHeader String name, @RequestHeader Long id) {
        log.info("用户名：" + name + ", id:" + id);
    }
}