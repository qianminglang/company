package com.clear.function;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

/**
 * ClassName DateFormatterUtil
 *
 * @author qml
 * Date 2020/12/31 15:33
 * Version 1.0
 **/

public class DateFormatterUtil {
    public static void main(String[] args) {
        Supplier<ThreadLocal> threadLocalSupplier = () -> ThreadLocal.withInitial(() -> new SimpleDateFormat("dd-MM-yyyy"));
        SimpleDateFormat sdf = (SimpleDateFormat) threadLocalSupplier.get().get();
        System.out.println(sdf.format(new Date()));
    }
}