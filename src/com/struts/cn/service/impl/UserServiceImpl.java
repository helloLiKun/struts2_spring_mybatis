package com.struts.cn.service.impl;

import com.struts.cn.entity.User;
import com.struts.cn.entity.UserExample;
import com.struts.cn.mapper.UserMapper;
import com.struts.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by likun on 2018/2/26 0026.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() {
        UserExample userExample=new UserExample();
        UserExample.Criteria c=userExample.createCriteria();
        c.andIdIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    @Autowired
    UserMapper userMapper;
}
