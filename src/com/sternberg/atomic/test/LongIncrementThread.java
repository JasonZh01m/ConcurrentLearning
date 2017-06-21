package com.sternberg.atomic.test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by JasonZh on 2017/6/6.
 */
public class LongIncrementThread implements Runnable {
    private long count = 0;

    @Override
    public void run() {
        synchronized (LongIncrementThread.class) {
            count++;

            System.out.println(count);
        }
    }
}
