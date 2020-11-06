package com.clear;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * ClassName FeignConsumer
 *
 * @author qml
 * Date 2020/11/5 17:46
 * Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignConsumer {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer.class, args);
    }


    /**
     * 使用了 Feign 之后，如果希望能够查看微服务之间调用的日志，则可以通过开启 Feign 的日志功能实现， Feign 中的日志级别一共分为四种：
     * <p>
     * NONE ，不开启日志记录，默认即此；
     * BASIC ，记录请求方法和请求 URL ，以及响应的状态码以及执行时间；
     * HEADERS ，在第2条的基础上，再增加请求头和响应头；
     * FULL ，在第3条的基础上再增加 body 以及元数据。
     *
     * @param
     * @return feign.Logger.Level
     * @author qml
     * @date 2020/11/6 17:40
     **/
    @Bean
    Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }
}