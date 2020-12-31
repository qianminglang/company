package com.clear.dataStructure;

/**
 * ClassName Copy
 *
 * @author qml
 * Date 2020/12/31 14:32
 * Version 1.0
 **/

public class Copy {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}