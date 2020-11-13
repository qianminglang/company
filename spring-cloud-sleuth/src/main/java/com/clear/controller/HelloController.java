package com.clear.controller;

import brave.Tracer;
import com.clear.service.SleuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName HelloController
 *
 * @author qml
 * Date 2020/11/13 16:30
 * Version 1.0
 **/
@RestController
@Slf4j
public class HelloController {

    @Value("${server.port}")
    Integer port;

    @Resource
    RestTemplate restTemplate;

    @Resource
    Tracer tracer;

    @Resource
    SleuthService sleuthService;

    @GetMapping("/hello")
    public String hello() {
        return "hello sleuth!";
    }

    @RequestMapping("/")
    public String hi() throws InterruptedException {
        log.info("hi!");
        Thread.sleep((int) Math.random() * 1000);
        String s = restTemplate.getForObject("http://localhost:" + this.port + "/hi2", String.class);
        return "hi" + s;
    }

    @RequestMapping("/hi2")
    public String hi2() throws InterruptedException {
        log.info("hi2!");
        int time = (int) Math.random() * 1000;
        Thread.sleep(time);
        this.tracer.currentSpan().tag("random-sleep-millis", String.valueOf(time));
        return "hi2";
    }

    @RequestMapping("/async")
    public String async() throws InterruptedException {
        log.info("async");
        sleuthService.background();
        return "async";
    }
}