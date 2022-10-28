package com.turning.spring.aop.annotation.proxy.service.Impl;

import com.turning.spring.aop.annotation.proxy.dao.UserDao;
import com.turning.spring.aop.annotation.proxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    //@Qualifier("userDaoImpl")
    private UserDao userDao;
    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
