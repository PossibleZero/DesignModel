package com.luckyzhang.day1;

/**
 * 枚举类实现单例的方式
 * 除了线程安全和防止反射强行调用构造器之外，还提供了自动序列化机制
 */
public enum SingleThree {
    Intance;

    public void getId() {

    }
}
