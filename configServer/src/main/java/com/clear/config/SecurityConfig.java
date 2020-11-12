package com.clear.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * ClassName SecurityConfig
 *
 * @author qml
 * Date 2020/11/12 16:55
 * Version 1.0
 **/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 注意，这里的配置首先是配置所有的请求都必须登录后才能访问，然后配置允许 HttpBasic 登录，
     * 这样我们在发起 /actuator/bus-refresh 请求时，就可以直接通过 HttpBaisc 来配置认证信息了。
     *
     * @param http
     * @return void
     * @author qml
     * @date 2020/11/12 16:59
     **/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //加此config可以在postman中通过设置Basic Auth来跳过验证spring security
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}