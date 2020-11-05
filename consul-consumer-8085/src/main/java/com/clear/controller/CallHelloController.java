package com.clear.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;

/**
 * ClassName CallHelloController
 *
 * @author qml
 * Date 2020/11/5 9:50
 * Version 1.0
 **/
@RestController
@Slf4j
public class CallHelloController {

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/call")
    private String call() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-provider");
        URI uri = serviceInstance.getUri();
        String serviceId = serviceInstance.getServiceId();
        log.info("服务地址：" + uri);
        log.info("服务名称：" + serviceId);

        String callServiceResult = new RestTemplate().getForObject(uri.toString() + "/hello", String.class);
        log.info("调用返回结果：" + callServiceResult);
        return callServiceResult;
    }

}