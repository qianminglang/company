package com.clear.thread;

/**
 * ClassName InterruptSleepClient
 *
 * @author qml
 * Date 2021/1/20 13:49
 * Version 1.0
 **/

public class InterruptSleepClient {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i+"i am doing my work");
                try {
                    System.out.println("i will sleep");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("my sleeping was interrupted");
                }
                System.out.println("i am interrupted?" + Thread.currentThread().isInterrupted());
            }
        });

        thread.start();
        Thread.sleep(1);
        thread.interrupt();
    }
}