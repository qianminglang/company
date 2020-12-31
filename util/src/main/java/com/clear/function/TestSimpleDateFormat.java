package com.clear.function;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.*;

/**
 * ClassName TestSimpleDateFormat
 *
 * @author qml
 * Date 2020/12/31 16:31
 * Version 1.0
 **/

public class TestSimpleDateFormat {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        Callable<Date> task = () -> sdf.parse("20201231");

        ExecutorService pool = Executors.newFixedThreadPool(2);
        ArrayList<Future<Date>> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(pool.submit(task));
        }

        for (Future<Date> dateFuture : result) {
            System.out.println(dateFuture.get());
        }
        pool.shutdown();
    }
}