package com.xin.service.impl;

import com.xin.entity.User;
import com.xin.mapper.UserMapper;
import com.xin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {

        return userMapper.getAllUsers();
    }
}
