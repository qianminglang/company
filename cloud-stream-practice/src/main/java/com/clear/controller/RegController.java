package com.clear.controller;

import com.clear.service.RegService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * ClassName RegController
 *
 * @author qml
 * Date 2020/11/13 11:46
 * Version 1.0
 **/
@RestController
public class RegController {
    @Resource
    RegService regService;

    @PostMapping("/doReg")
    public Map<String, Object> doReg(String email, String phone, String password) {
        return regService.doReg(email, phone, password);
    }
}