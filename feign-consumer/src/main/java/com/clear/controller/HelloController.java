package com.clear.controller;

import com.clear.dto.input.User;
import com.clear.service.HelloService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/6 9:15
 * Version 1.0
 **/
@RestController
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    private String hello(String name) {
        return helloService.hello(name);
    }

    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable Long id) {
        helloService.delete(id);
    }

    @GetMapping("/getUser")
    private User getUser(String name) {
        return helloService.getUser(name);
    }

    @GetMapping("/addUser")
    private User addUser(@RequestBody User user) {
        return helloService.addUser(user);
    }

    @GetMapping("/updateUserById")
    private void updateUserById(@RequestHeader String name, @RequestHeader Long id) {
        helloService.updateUserById(name, id);
    }
}