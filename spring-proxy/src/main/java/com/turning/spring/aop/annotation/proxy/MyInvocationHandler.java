package com.turning.spring.aop.annotation.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    public MyInvocationHandler() {
    }
    public MyInvocationHandler(Object target) {
       this.target = target;
    }

    /**
     * @param proxy：代理对象
     * @param method：正在被调用的方法对象
     * @param args：正在被调用的方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 获取被调用方法的方法名
        String methodName = method.getName();
        // 执行相应方法前的工作
        System.out.println("logging proxy ===> the method " + methodName + " begin with " + Arrays.toString(args));
        // 设置method对象的可访问权限
        method.setAccessible(true);
        // 通过反射调用target对象的method方法，传入args参数列表
        Object result = method.invoke(target, args);
        // 执行相应方法后的工作
        System.out.println("logging proxy ===> the method " + methodName + " end with " + result);
        return result;
    }


}
