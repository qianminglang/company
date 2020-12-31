package com.clear.function;

import java.util.function.Function;

/**
 * ClassName AndThen
 *
 * @author qml
 * Date 2020/12/31 11:08
 * Version 1.0
 **/

public class AndThen {
    public static void main(String[] args) {
        Function<Integer, Integer> A = i -> i + 1;
        Function<Integer, Integer> B = i -> i * i;
        System.out.println("F1:" + B.apply(A.apply(5)));
        System.out.println("F1:" + B.compose(A).apply(5));

        System.out.println("F2:" + A.apply(B.apply(5)));
        System.out.println("F2:" + B.andThen(A).apply(5));
    }
}