package com.clear.stream;

import java.util.Random;

/**
 * ClassName SortedStream
 *
 * @author qml
 * Date 2020/12/31 9:50
 * Version 1.0
 **/

public class SortedStream {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}