package com.turning.spring.aop.annotation.proxy.pojo.test;

import com.turning.spring.aop.annotation.proxy.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
        @Test
        public void test() {
                ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
                HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
                helloworld.sayHello();

        }

}
