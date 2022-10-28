package com.turning.spring.aop.annotation.proxy.service.impl;

import com.turning.spring.aop.annotation.proxy.service.UserService;
import com.turning.spring.aop.annotation.proxy.dao.UserDao;

public class UserServiceImpl implements UserService {
        private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
