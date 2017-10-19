package com.luckyzhang.design.single;

public class SingleOne {

    private volatile static SingleOne singleOne;//禁止指令重排序列（volatile）

    private SingleOne() {

    }

    /**
     * DCL实现单例的方式（双重检验锁）
     *
     * @return
     */
    public static SingleOne getInstance() {
        if (singleOne == null) {
            synchronized (SingleOne.class) {
                if (singleOne == null) {
                    singleOne = new SingleOne();
                }
            }
        }
        return singleOne;
    }
}
