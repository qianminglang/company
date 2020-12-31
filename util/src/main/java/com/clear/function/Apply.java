package com.clear.function;

import java.util.function.Function;

/**
 * ClassName Apply
 *
 * @author qml
 * Date 2020/12/31 10:43
 * Version 1.0
 **/

public class Apply {
    public static void main(String[] args) {
        Function<Integer, Integer> test = i -> i + 1;
        Integer apply = test.apply(5);
        System.out.println(apply);
    }
}