package com.clear.function;

import java.util.function.UnaryOperator;

/**
 * ClassName UnOperatorUtil
 *
 * @author qml
 * Date 2020/12/31 15:18
 * Version 1.0
 **/

public class UnOperatorUtil {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator=x->x+1;
        System.out.println(unaryOperator.apply(5));

        System.out.println(UnaryOperator.identity().apply(5));
        System.out.println(UnaryOperator.identity().apply("1234567890"));

    }
}