package com.turning.spring.aop.annotation.proxy.dao.impl;

import com.turning.spring.aop.annotation.proxy.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功！");
    }
}
