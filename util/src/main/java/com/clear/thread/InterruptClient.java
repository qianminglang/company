package com.clear.thread;

/**
 * ClassName InterruptClient
 *
 * @author qml
 * Date 2021/1/20 11:47
 * Version 1.0
 **/

public class InterruptClient {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("i am doing my work");
                System.out.println("i am interrupted?" + Thread.currentThread().isInterrupted());
            }
        });

        t.start();
        Thread.sleep(1);
        t.interrupt();
    }
}