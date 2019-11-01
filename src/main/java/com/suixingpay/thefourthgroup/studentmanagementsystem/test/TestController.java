package com.suixingpay.thefourthgroup.studentmanagementsystem.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试访问 jsp
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("getResult")
    public String home(){

        return "index";
    }
}
