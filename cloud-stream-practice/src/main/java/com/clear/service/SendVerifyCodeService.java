package com.clear.service;

import com.clear.component.MailService;
import com.clear.rabbit.RegChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import java.util.Map;

/**
 * ClassName SendVerifyCodeService
 *
 * @author qml
 * Date 2020/11/13 13:48
 * Version 1.0
 **/
@EnableBinding(RegChannel.class)
public class SendVerifyCodeService {

    @Resource
    MailService mailService;

    @Resource
    TemplateEngine templateEngine;

    @StreamListener(RegChannel.INPUT)
    public void sendVerifyCode(Map<String, Object> map) {
        //发送邮件和短信
        System.out.println("receive:" + map);
        Context ctx = new Context();
        String email = (String) map.get("email");
        ctx.setVariable("email", email);
        ctx.setVariable("code", (int)(Math.random()*10000));
        String mail = templateEngine.process("mailtemplate.html", ctx);
        mailService.sendHtmlMail("569040804@qq.com", email, "欢迎注册xxx网站", mail);
    }
}