package com.turning.spring.aop.annotation.proxy.test;

import com.turning.spring.aop.annotation.proxy.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByXmlTest {
    @Test
    public void testAutowire() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController controller = ioc.getBean(UserController.class);
        controller.saveUser();
    }
}
