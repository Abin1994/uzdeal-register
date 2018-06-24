package com.itcat.uzdealregister.controller;


import com.itcat.uzdealregister.entity.User;
import com.itcat.uzdealregister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lingbinli123
 * @since 2018-06-24
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;






    /**
     * 新增
     * @param entity
     * @return
     */
    @RequestMapping("/insert")
    public void insert(){
        User user = new User();
        user.setId(1);
        user.setUserName("tony");
        user.setUserPassword("1234");

        userService.insert(user);
    }


}

