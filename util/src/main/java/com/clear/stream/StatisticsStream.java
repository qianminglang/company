package com.clear.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * ClassName StatisticsStream
 *
 * @author qml
 * Date 2020/12/31 10:04
 * Version 1.0
 **/

public class StatisticsStream {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics intSummaryStatistics = integers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("最大值："+intSummaryStatistics.getMax());
        System.out.println("最小值："+intSummaryStatistics.getMin());
        System.out.println("求和："+intSummaryStatistics.getSum());
        System.out.println("求平均："+intSummaryStatistics.getAverage());
    }
}