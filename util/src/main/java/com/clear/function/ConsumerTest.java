package com.clear.function;

import java.util.function.Consumer;

/**
 * ClassName ConsumerTest
 *
 * @author qml
 * Date 2020/12/31 14:51
 * Version 1.0
 **/

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> consumer=(x)->{
            int num=x*2;
            System.out.println(num);
        };
        Consumer<Integer> consumer1=(x)->{
            int num=x*3;
            System.out.println(num);
        };

        consumer.andThen(consumer1).accept(10);

    }
}