/*
 * Copyright 2020 Wicrenet, Inc. All rights reserved.
 */
package com.example.springbootbatis.mapper;

import com.example.springbootbatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> queryUserList();

}
