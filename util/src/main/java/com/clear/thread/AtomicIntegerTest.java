package com.clear.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName AtomicIntegerTest
 *
 * @author qml
 * Date 2021/1/25 14:23
 * Version 1.0
 **/

public class AtomicIntegerTest {
    private static AtomicInteger count=new AtomicInteger();
    public static void main(String[] args) {
        int i = count.incrementAndGet();
        System.out.println(i);
    }
}