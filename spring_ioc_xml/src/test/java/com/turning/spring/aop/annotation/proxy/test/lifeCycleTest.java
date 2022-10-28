package com.turning.spring.aop.annotation.proxy.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifeCycleTest {
    @Test
    public void testLifeCycle() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifeCycle.xml");
//        User user = ioc.getBean(User.class);
//        System.out.println(user);
//        ioc.close();
    }
}
