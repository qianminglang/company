package com.clear.function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ClassName SimpleDateFormatTest
 *
 * @author qml
 * Date 2020/12/31 16:50
 * Version 1.0
 **/

public class SimpleDateFormatTest {
    //    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 100, 1, TimeUnit.MINUTES, new LinkedBlockingDeque<>(1000), new MyThreadFactory("simFate"));

    public void test() {
        while (true) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
//                        String format = sdf.format(new Date());
//                        Date parse = sdf.parse(format);
//                        String format1 = sdf.format(parse);
//                        System.out.println(format1.equals(format));

                    LocalDate now = LocalDate.now();
                    String format2 = dateTimeFormatter.format(now);
                }
            });
        }
    }

    public static void main(String[] args) {
        new SimpleDateFormatTest().test();
    }
}