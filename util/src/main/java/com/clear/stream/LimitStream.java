package com.clear.stream;

import java.util.Random;

/**
 * ClassName LimitStream
 *
 * @author qml
 * Date 2020/12/31 9:37
 * Version 1.0
 **/

public class LimitStream {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}