package com.clear.service;

import brave.Tracer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
 * ClassName SleuthService
 *
 * @author qml
 * Date 2020/11/13 17:00
 * Version 1.0
 **/
@Service
@Slf4j
public class SleuthService {
    @Resource
    Tracer tracer;

    Random random = new Random();

    @Async
    public void background() throws InterruptedException {
        log.info("background");
        int millis = random.nextInt(1000);
        Thread.sleep(millis);
        tracer.currentSpan().tag("background-sleep-millis", String.valueOf(millis));
    }

    @Scheduled(fixedDelay = 36000)
    public void schedule() throws InterruptedException {
        log.info("start some work from schedule task");
        background();
        log.info("end work from schedule task");
    }
}