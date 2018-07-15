package com.itcat.uzdealregister.controller;


import com.itcat.uzdealregister.service.MiaoshaUserService;
import com.itcat.uzdealregister.vo.LoginVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lingbinli
 * @since 2018-07-15
 */
@RestController
@RequestMapping("/miaoshao")
@Slf4j
public class MiaoshaUserController {

    private MiaoshaUserService service;

    @PostMapping("/do_login")
    public Object doLogin(@Valid LoginVO loginVO){
        log.info(loginVO.toString());

        service.login(loginVO);
        return "success...";
    }
}

