package com.clear.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * ClassName FeignHelloService
 *
 * @author qml
 * Date 2020/11/6 17:21
 * Version 1.0
 **/
@FeignClient("provider")
public interface FeignHelloService extends HelloService {
}