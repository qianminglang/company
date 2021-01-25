package com.clear.thread;

/**
 * ClassName JoinClient
 *
 * @author qml
 * Date 2021/1/20 14:33
 * Version 1.0
 **/

public class JoinClient {
    public static void main(String[] args) throws InterruptedException {
        Thread back = createWorker("后台开发", "开发接口");
        Thread font = createWorker("前端开发", "设计页面");
        Thread test = createWorker("测试", "测试工作");
        back.start();
        font.start();

        back.join();
        font.join();

        test.start();
    }

    private static Thread createWorker(String role, String work) {
        return new Thread(() -> {
            System.out.println("i finished" + work + "as a " + role);
        });
    }

}