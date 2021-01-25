package com.clear.thread;

/**
 * ClassName Visibility
 *
 * @author qml
 * Date 2021/1/21 10:41
 * Version 1.0
 **/

public class Visibility {
    private static class ShowVisibility implements Runnable {
        private volatile Boolean flag = false;

        @Override
        public void run() {
            while (true) {
                if (flag) {
                    System.out.println(Thread.currentThread().getName() + ":" + flag);
                }else {
                    System.out.println(Thread.currentThread().getName() + "===========" + flag);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ShowVisibility showVisibility = new ShowVisibility();
        Thread thread = new Thread(showVisibility);
        thread.start();
        //给线程启动时间
        Thread.sleep(500);
        //更新flag
        showVisibility.flag=true;
        System.out.println("flag is true, thread should print");
        Thread.sleep(1000);
        System.out.println("I have slept 1 seconds. I guess there was nothing printed ");
    }
}