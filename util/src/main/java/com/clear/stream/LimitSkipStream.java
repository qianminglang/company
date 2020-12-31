package com.clear.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName LimitSkipStream
 *
 * @author qml
 * Date 2020/12/31 9:43
 * Version 1.0
 **/

public class LimitSkipStream {
    public static void main(String[] args) {
        int pageSize=3;
        int currentPage=2;
        List<Integer> pageList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        List<Integer> list = pageList.stream()
                .skip(pageSize * (currentPage - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }
}