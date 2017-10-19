package com.luckyzhang.design.single;

/**
 * 静态内部类（懒汉模式）
 */
public class SingleTwo {

    private SingleTwo() {
    }

    /**
     * 1. 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，
     * 2.  而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class Holder {
        final static SingleTwo singleTwo = new SingleTwo();
    }

    public static SingleTwo getInstance() {
        return Holder.singleTwo;
    }
}
