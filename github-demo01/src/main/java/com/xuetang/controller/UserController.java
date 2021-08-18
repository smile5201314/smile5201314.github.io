package com.xuetang.controller;

import com.xuetang.domain.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * 2021年08月18日 15:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public User login(){
        System.out.println("hello");
        return new User();
    }
}
