package com.sternberg.imooc;

/**
 * Created by JasonZh on 2017/5/25.
 */
public class TicketsThread extends Thread {

    private int ticketsCount = 5;
    private String name;

    public TicketsThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (ticketsCount > 0) {
            ticketsCount--;
            System.out.println("窗口:" + name + "卖出了一张票！剩余票数:" + ticketsCount);
        }
    }

    public static void main(String[] args) {
        TicketsThread t1 = new TicketsThread("A");
        TicketsThread t2 = new TicketsThread("B");
        TicketsThread t3 = new TicketsThread("C");
        t1.start();
        t2.start();
        t3.start();
    }

}
