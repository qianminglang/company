package com.clear.dataStructure;

/**
 * ClassName test
 *
 * @author qml
 * Date 2020/12/31 13:53
 * Version 1.0
 **/

public class TwoArray {
    public static void main(String[] args) {
        //静态初始化
        int[][] arr={{1,2},{3,4},{5,6},{7,8},{9,10}};

        //动态初始化可以理解为5行2列
        int[][] ints = new int[arr.length][arr[0].length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ints[i][j]=arr[i][j];
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//            System.out.println("===");
//        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.println(ints[i][j]);
            }
            System.out.println("===");
        }
    }
}