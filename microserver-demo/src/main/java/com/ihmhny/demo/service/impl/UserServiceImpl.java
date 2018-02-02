package com.ihmhny.demo.service.impl;

import com.ihmhny.demo.dao.UserDao;
import com.ihmhny.demo.entity.User;
import com.ihmhny.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xiaobei
 * @createTime: 2018-02-02 16:31
 * @since: JDK 1.8
 * @description: 用户相关
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectByParams(String username) {
        return userDao.selectByParams(username);
    }

    @Override
    public int insertByParams(String name, String password) {
        return userDao.insertByParams(name,password);
    }
}