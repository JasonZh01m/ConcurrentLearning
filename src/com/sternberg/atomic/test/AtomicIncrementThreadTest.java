package com.sternberg.atomic.test;

import java.util.Date;

/**
 * Created by JasonZh on 2017/6/6.
 */
public class AtomicIncrementThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Date date1 = new Date();
        AtomicIncrementThread incre = new AtomicIncrementThread();
//        LongIncrementThread incre = new LongIncrementThread();


        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(incre);
            thread.start();
        }

        Thread.sleep(100);

        Date date2 = new Date();
        System.out.println("ss:" + (date2.getTime() - date1.getTime()));
    }

}
