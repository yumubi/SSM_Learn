package com.turning.spring.aop.annotation.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target) {
        try {
            this.target = target;
        } catch (Exception e) {
            System.out.println("exception");
        }
    }

    /**
     * ClassLoader loader:指定动态加载生成的代理类的类加载器
     *     @NotNull Class<?>[] interfaces：获取目标对象实现的所有接口的class对象的数组
     *     @NotNull InvocationHandler h：设置代理类的抽象方法如何重写
     */




    public Object getProxy() {

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = this.target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("日志 方法：" + method.getName() + " 参数：" + Arrays.toString(args));
                    //proxy表示代理对象  method表示要执行的方法  args表示要执行的方法的参数列表
                    result = method.invoke(target, args);
                    System.out.println("日志 方法：" + method.getName() + " 结果：" + result);
                } catch (Exception e) {
                    System.out.println("日志 方法：" + method.getName() + " 异常：" + e);
                } finally {
                    System.out.println("日志 方法：" + method.getName() + " 方法执行完毕" );
                }
                return result;
            }
        };

        return Proxy.newProxyInstance(classLoader, interfaces, h);
    }


//    public static Object getInstance(Object target) {
//        // 获取被代理类的加载器，用以加载动态生成的代理对象
//        ClassLoader loader = target.getClass().getClassLoader();
//        // 获取被代理类的所有接口，用以保证代理对象与被代理对象有相同的方法
//        Class<?>[] interfaces = target.getClass().getInterfaces();
//        // 实例化InvocationHandler对象，绑定需要被代理的对象
//        MyInvocationHandler handler = new MyInvocationHandler(target);
//        // 返回该被代理类的代理类对象
//        return Proxy.newProxyInstance(loader, interfaces, handler);
//    }



}
