package com.luckyzhang.design.proxy;

/**
 * 真实的主题类
 */
public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("visit");
    }

    @Override
    public void goShopping() {
        System.out.println("goShopping");

    }

    @Override
    public void sendDoll() {
        System.out.println("sendDoll");

    }
}
