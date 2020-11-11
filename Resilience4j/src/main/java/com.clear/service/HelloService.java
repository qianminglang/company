package com.clear.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 江南一点雨
 * @Date 2019/4/8 20:08
 */
@Service
//@Retry(name = "retryBackendA")
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hello(@RequestParam("name") String name, @RequestParam("fool")String fool) {
        return restTemplate.getForObject("http://provider/hello?name={1}", String.class, name,fool);
    }
}
