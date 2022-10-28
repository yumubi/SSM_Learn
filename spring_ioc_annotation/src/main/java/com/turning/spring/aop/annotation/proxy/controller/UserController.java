package com.turning.spring.aop.annotation.proxy.controller;


import com.turning.spring.aop.annotation.proxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller("controller")
@Controller
public class UserController {

    @Autowired
    //@Qualifier("userServiceImpl")
    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void saveData() {
            userService.saveUser();
        }
}
