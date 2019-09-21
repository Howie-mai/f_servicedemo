package com.zhku.mh.servicedemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhku.mh.servicedemo.entities.User;
import com.zhku.mh.servicedemo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/get/{id}")
    public User get(@PathVariable Integer id){
        return userService.get(id);
    }
}
