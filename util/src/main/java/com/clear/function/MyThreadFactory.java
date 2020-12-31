package com.clear.function;

import java.util.concurrent.ThreadFactory;

/**
 * ClassName MyThreadFactory
 *
 * @author qml
 * Date 2020/12/31 16:54
 * Version 1.0
 **/

public class MyThreadFactory implements ThreadFactory {
    private String name;

    public MyThreadFactory(String name) {
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r, name);
    }
}