package com.edu.service.impl;

import com.edu.dao.UserMapper;
import com.edu.pojo.User;
import com.edu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insertSelective(user);
    }
}
