package com.clear.thread;

import java.util.LinkedList;

/**
 * ClassName WaitNotifyClient
 *
 * @author qml
 * Date 2021/1/20 16:07
 * Version 1.0
 **/

public class WaitNotifyClient {
    public static void main(String[] args) {
        LinkedList<Task> tasks = new LinkedList<>();

        Student xiaoming = new Student("小明", tasks);
        xiaoming.start();

        Student xiaowang = new Student("小王", tasks);
        xiaowang.start();

        Teacher lilaoshi = new Teacher("李老师", tasks);
        lilaoshi.start();

        Teacher zhanglaoshi = new Teacher("张老师", tasks);
        zhanglaoshi.start();
    }
}