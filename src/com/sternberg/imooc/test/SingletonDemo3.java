package com.sternberg.imooc.test;

/**
 * Created by JasonZh on 2017/6/6.
 */
public class SingletonDemo3 {
    private static final SingletonDemo3 INSTANCE = new SingletonDemo3();

    private SingletonDemo3() {

    }

    public static SingletonDemo3 getInstance() {
        return INSTANCE;
    }
}
