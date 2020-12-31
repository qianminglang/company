package com.clear.stream;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName ParallelStream
 *
 * @author qml
 * Date 2020/12/31 9:15
 * Version 1.0
 **/

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.forEach(System.out::print);
    }
}