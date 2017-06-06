package com.sternberg.atomic.test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by JasonZh on 2017/6/6.
 */
public class AtomicIncrementThread implements Runnable {
    //    private long count = 0;
    private AtomicLong count = new AtomicLong(0);

    @Override
    public void run() {
//        count++;
        count.incrementAndGet();
        System.out.println(count);
    }
}
