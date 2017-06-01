package com.imooc.concurrent.base;

/**
 * Created by JasonZh on 2017/6/1.
 */
// 隋唐演义大戏舞台
public class Stage extends Thread {

    @Override
    public void run() {
        System.out.println("欢迎观看隋唐演义！");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("大幕徐徐拉开！");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("隋朝末年，农民起义军与隋军杀得昏天暗地！");

        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
        ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();

        // 使用Runnable接口创建线程
        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "隋军");
        Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民起义军");

        // 启动线程，让军队开始作战
        armyOfSuiDynasty.start();
        armyOfRevolt.start();

        // 舞台线程休眠，大家专心观看军队厮杀
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        armyTaskOfSuiDynasty.keepRunning = false;
//        armyTaskOfRevolt.keepRunning = false;
//
//        try {
//            armyOfRevolt.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("正当双方激战正酣，半路杀出了个程咬金！");
        Thread mrCheng = new KeyPersonThread();
        mrCheng.setName("程咬金");

        System.out.println("程咬金的理想就是结束战争，让百姓安居乐业！");

        armyTaskOfSuiDynasty.keepRunning = false;
        armyTaskOfRevolt.keepRunning = false;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 历史留给关键人物
        mrCheng.start();
        try {
            // 让所有线程等待程咬金完成历史使命
            mrCheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("战争结束，百姓安居乐业，程咬金实现了人生理想！");
        System.out.println("剧终，谢谢观看！");
    }

    public static void main(String[] args) {
        new Stage().start();
    }
}
