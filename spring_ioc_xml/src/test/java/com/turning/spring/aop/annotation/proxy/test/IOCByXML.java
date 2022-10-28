package com.turning.spring.aop.annotation.proxy.test;

import com.turning.spring.aop.annotation.proxy.pojo.Clazz;
import com.turning.spring.aop.annotation.proxy.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXML {
    @Test
    public void testIOC() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Student studentOne = (Student)ioc.getBean("studentOne");
        Object studentOne = ioc.getBean("studentOne");
        System.out.println(studentOne);
        Student studentFive = ioc.getBean("studentFive", Student.class);
        System.out.println(studentFive);
        Student studentSix = ioc.getBean("studentSix", Student.class);
        System.out.println(studentSix);
    }

    @Test
    public void testDI() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);
        System.out.println(clazzOne);
    }

}
