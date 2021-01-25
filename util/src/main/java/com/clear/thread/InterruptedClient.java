package com.clear.thread;

/**
 * ClassName InterruptedClient
 *
 * @author qml
 * Date 2021/1/20 14:24
 * Version 1.0
 **/

public class InterruptedClient {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("I'm doing my work");
                System.out.println("I'm interrupted?" + Thread.currentThread().isInterrupted());
//                System.out.println("I'm interrupted?"+Thread.interrupted());
            }
        });

        thread.start();
        Thread.sleep(1);
        thread.interrupt();
    }
}