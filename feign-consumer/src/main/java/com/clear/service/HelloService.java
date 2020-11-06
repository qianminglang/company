package com.clear.service;

import com.clear.dto.input.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName HelloService
 *
 * @author qml
 * Date 2020/11/6 9:13
 * Version 1.0
 **/
@FeignClient("provider")
public interface HelloService {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable("id") Long id);

    @GetMapping("/getUser")
    User getUser(@RequestParam("name") String name);

    @PostMapping("/addUser")
    User addUser(@RequestBody User user);

    @PutMapping("/updateUserById")
    void updateUserById(@RequestHeader("name") String name, @RequestHeader("id") Long id);

}