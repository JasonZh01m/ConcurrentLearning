package com.sternberg.imooc;

/**
 * Created by JasonZh on 2017/5/25.
 */
public class TicketsRunnableThread implements Runnable {

    private int ticketsCount = 5;

    @Override
    public void run() {
        while (ticketsCount > 0) {
            ticketsCount--;
            System.out.println("窗口:" + Thread.currentThread().getName() + "卖出了一张票！剩余票数:" + ticketsCount);
        }
    }

    public static void main(String[] args) {
        TicketsRunnableThread thread = new TicketsRunnableThread();
        Thread t1 = new Thread(thread, "A");
        Thread t2 = new Thread(thread, "B");
        Thread t3 = new Thread(thread, "C");
        t1.start();
        t2.start();
        t3.start();
    }
}
