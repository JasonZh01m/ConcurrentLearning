package com.imooc.concurrent.base;

/**
 * Created by JasonZh on 2017/6/1.
 */
// 军队线程，模拟作战双方的行为
public class ArmyRunnable implements Runnable {

    // volatile保证了线程可以正确的读取其他线程写入的值
    // 可见性，参考JMM java 内存模型
    volatile boolean keepRunning = true;

    @Override
    public void run() {
        while(keepRunning) {
            // 发动5连击
            for(int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "进攻对方[" + i + "]");
                // 释放处理器资源，让出处理器时间，下次谁进攻还不一定呢
                Thread.yield();
            }

            System.out.println(Thread.currentThread().getName() + "结束了战斗！");

        }
    }
}
