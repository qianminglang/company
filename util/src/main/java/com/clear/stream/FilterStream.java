package com.clear.stream;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName FilterMap
 *
 * @author qml
 * Date 2020/12/31 9:28
 * Version 1.0
 **/

public class FilterStream {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ab", "ac", "", "df","");
        long count = stringList.stream().filter(String::isEmpty).count();
        System.out.println(count);
    }
}