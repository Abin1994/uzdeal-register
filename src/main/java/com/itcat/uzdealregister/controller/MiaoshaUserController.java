package com.itcat.uzdealregister.controller;


import com.itcat.uzdealregister.result.Result;
import com.itcat.uzdealregister.service.MiaoshaUserService;
import com.itcat.uzdealregister.vo.MiaoshaUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lingbinli
 * @since 2018-06-26
 */
@Controller
@RequestMapping("/miaosha")
@Slf4j
public class MiaoshaUserController {

    @Autowired
    private MiaoshaUserService miaoshaUserService;

    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }

    @ResponseBody
    @PostMapping("/do_login")
    public Result<String> doLogin(HttpServletResponse response, @Valid MiaoshaUserVo userVo){
        log.info(userVo.toString());
        //登录
        String token = miaoshaUserService.login(response,userVo);
        return Result.success(token);
    }
}

