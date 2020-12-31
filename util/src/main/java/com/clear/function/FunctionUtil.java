package com.clear.function;

import java.util.function.Function;

/**
 * ClassName FunctionUtil
 *
 * @author qml
 * Date 2020/12/31 10:49
 * Version 1.0
 **/

public class FunctionUtil {
    public static Integer calculate(Function<Integer, Integer> test, Integer number) {
        return test.apply(number);
    }

    public static void main(String[] args) {
        Integer calculate1 = FunctionUtil.calculate(i->i+i,FunctionUtil.calculate(i -> i * i, 2));
        Integer calculate2 = FunctionUtil.calculate(i->i*i,FunctionUtil.calculate(i -> i + 1, 2));
        System.out.println(calculate1);
        System.out.println(calculate2);
    }
}