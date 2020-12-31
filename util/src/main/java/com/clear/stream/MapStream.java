package com.clear.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName MapStream
 *
 * @author qml
 * Date 2020/12/31 9:25
 * Version 1.0
 **/

public class MapStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> outList = list.stream().map(e -> e + 2).distinct().collect(Collectors.toList());
        list.forEach(System.out::print);
        System.out.println();
        outList.forEach(System.out::print);
    }
}