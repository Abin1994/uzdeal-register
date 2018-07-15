package com.itcat.uzdealregister.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 跳转到登陆页面
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/15
 */
@Controller
public class WelcomeController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
