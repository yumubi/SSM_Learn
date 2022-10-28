package com.turning.spring.aop.annotation.proxy.controller;

import com.turning.spring.aop.annotation.proxy.service.UserService;

public class UserController {
        private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
