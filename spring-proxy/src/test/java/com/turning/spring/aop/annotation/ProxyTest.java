package com.turning.spring.aop.annotation;

import com.turning.spring.aop.annotation.proxy.ProxyFactory;
import com.turning.spring.aop.annotation.proxy.Calculator;
import com.turning.spring.aop.annotation.proxy.CalculatorImpl;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void testProxy() {

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        calculator.add(4,54);


    }
}
