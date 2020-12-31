package com.clear.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName CollectionsStream
 *
 * @author qml
 * Date 2020/12/31 9:53
 * Version 1.0
 **/

public class CollectionsStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "", "d", "f", "");
        List<String> filterStr = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表："+filterStr);

        String string = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
        System.out.println("合并字符串："+string);

    }
}