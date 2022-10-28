package com.turning.spring.aop.annotation.proxy.test;

import com.turning.spring.aop.annotation.proxy.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void testAnnotation() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-context.xml");
        UserController userController = ioc.getBean(UserController.class);
//        System.out.println(userController);
//        UserService userService = ioc.getBean( "userServiceImpl",UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean( "userDaoImpl",UserDao.class);
//        System.out.println(userDao);
        userController.saveData();
    }
}
