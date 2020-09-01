/*
 * Copyright 2020 Wicrenet, Inc. All rights reserved.
 */
package com.example.springbootbatis;

import com.example.springbootbatis.domain.User;
import com.example.springbootbatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description of MybatisTest
 *
 * @author Administrator
 * Created on 2020/9/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootbatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users );

    }
}
