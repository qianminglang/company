package com.clear.controller;

import com.clear.dto.input.User;
import com.clear.service.FeignHelloService;
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
    private FeignHelloService feignHelloService;

    @GetMapping("/hello")
    public String hello(String name) {
        return feignHelloService.hello(name, null);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        feignHelloService.delete(id);
    }

    @GetMapping("/getUser")
    public User getUser(String name) {
        return feignHelloService.getUser(name);
    }

    @GetMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return feignHelloService.addUser(user);
    }

    @GetMapping("/updateUserById")
    public void updateUserById(@RequestHeader String name, @RequestHeader Long id) {
        feignHelloService.updateUserById(name, id);
    }
}