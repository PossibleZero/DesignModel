package com.luckyzhang.design.proxy;

/**
 * 代理类
 */
public class ProxySubject implements Subject {

    Subject subject;

    public ProxySubject(Subject realSubject) {
        this.subject = realSubject;
    }

    @Override
    public void visit() {
        subject.visit();
    }

    @Override
    public void goShopping() {
        subject.goShopping();
    }

    @Override
    public void sendDoll() {
        subject.sendDoll();
    }
}
