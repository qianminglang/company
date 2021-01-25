package com.clear.thread;

/**
 * ClassName DeadLock
 *
 * @author qml
 * Date 2021/1/25 11:52
 * Version 1.0
 **/

public class DeadLock {
    private static final String read_lock=new String();
    private static final String write_lock=new String();

    private void read(){
        synchronized (read_lock){
            System.out.println(Thread.currentThread().getName()+"得到读锁，下面获取写锁");
            synchronized ((write_lock)){
                System.out.println(Thread.currentThread().getName()+"读写锁都得到");
            }
        }
    }

    private void write(){
        synchronized (write_lock){
            System.out.println(Thread.currentThread().getName()+"得到写锁，下面获取读锁");
            synchronized ((read_lock)){
                System.out.println(Thread.currentThread().getName()+"读写锁都得到");
            }
        }
    }

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        new Thread(()->{
           while (true){
               deadLock.read();
           }
        },"read-local").start();

        new Thread(() -> {
            while (true) {
                deadLock.write();
            }
        }, "write-local").start();
    }
}