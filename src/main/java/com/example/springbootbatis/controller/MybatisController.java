/*
 * Copyright 2020 Wicrenet, Inc. All rights reserved.
 */
package com.example.springbootbatis.controller;

import com.example.springbootbatis.domain.User;
import com.example.springbootbatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description of MybatisController
 *
 * @author Administrator
 * Created on 2020/9/1
 */
@Controller
public class MybatisController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
