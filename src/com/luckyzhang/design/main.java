package com.luckyzhang.design;

import com.luckyzhang.design.proxy.DynamicProxy;
import com.luckyzhang.design.proxy.ProxySubject;
import com.luckyzhang.design.proxy.RealSubject;
import com.luckyzhang.design.proxy.Subject;

import java.lang.reflect.Proxy;

public class main {

    public static void main(String[] args) {
        //代理模式
        RealSubject realSubject = new RealSubject();
        ProxySubject subject = new ProxySubject(realSubject);
        subject.goShopping();

        //动态代理
        Subject subject1 = new RealSubject();
        ClassLoader classLoader = subject1.getClass().getClassLoader();
        DynamicProxy proxy = new DynamicProxy(subject1);
        Subject newProxyInstance = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
        newProxyInstance.goShopping();

    }
}
