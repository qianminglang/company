package com.clear.thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * ClassName Teacher
 *
 * @author qml
 * Date 2021/1/20 15:36
 * Version 1.0
 **/

public class Teacher extends Thread {
    private String name;
    private List<String> publishWords = Arrays.asList("aaa", "bbb", "ccc", "ddd");
    private LinkedList<Task> tasks;
    private int Max = 10;


    public Teacher(String name, LinkedList<Task> tasks) {
        super(name);
        this.name = name;
        this.tasks = tasks;
    }


    private void arrangePunishment() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        while (true) {
            synchronized (tasks) {
                if (tasks.size() < Max) {
                    Task task = new Task(new Random().nextInt(3) + 1, getPublishWord());
                    tasks.add(task);
                    System.out.println(threadName+"留了作业，抄写"+task.getWordToCopy()+" "+task.getTimes());
                    tasks.notifyAll();
                }else {
                    System.out.println("开始等待");
                    tasks.wait();
                    System.out.println("teacher线程 " + threadName + "线程-" + name + "等待结束");
                }
            }
        }
    }

    private String getPublishWord() {
        return publishWords.get(new Random().nextInt(publishWords.size()));
    }

    public static void main(String[] args) {
        while (true){
            System.out.println(new Random().nextInt(5));
        }
    }

    @Override
    public void run() {
        try {
            arrangePunishment();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}