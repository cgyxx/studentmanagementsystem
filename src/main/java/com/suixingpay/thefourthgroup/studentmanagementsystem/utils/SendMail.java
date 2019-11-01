package com.suixingpay.thefourthgroup.studentmanagementsystem.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//发送邮箱
public class SendMail {

    @Autowired
    private JavaMailSender jms; //自动注入的Bean

    public boolean sendMail(String sender,String receiver,String title,String text){
//        JavaMailSenderImpl jms = new JavaMailSenderImpl();
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom(sender);
        //接收者
        mainMessage.setTo(receiver);
        //发送的标题
        mainMessage.setSubject(title);
        //发送的内容
        mainMessage.setText(text);
        jms.send(mainMessage);
        return true;
    }

}
