package com.imooc.concurrent.base;

/**
 * Created by JasonZh on 2017/6/2.
 */
public class KeyPersonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始了战斗！");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "左突右杀，攻击隋军！");
        }
        System.out.println(Thread.currentThread().getName() + "停止了战斗！");
    }
}
