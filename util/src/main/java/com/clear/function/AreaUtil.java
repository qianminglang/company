package com.clear.function;

import java.util.Objects;

/**
 * ClassName AreaUtil
 *
 * @author qml
 * Date 2020/12/31 11:43
 * Version 1.0
 **/

public class AreaUtil {

    /**
     * 检测指定的位置点是否在指定闭合区域内
     * @param {number} x 待检测X方向位置点
     * @param {number} y 待检测Y方向位置点
     * @param targetArea 目标区域闭合点集 [[0,1]]结构 0-X方向 1-Y方向
     * @returns {boolean}
     */
    public static Boolean IsPtInArea(double x,double y,double[][] targetArea){
        // 闭合区域至少四个位置点
        if (Objects.isNull(targetArea) || targetArea.length < 4) {
            return false;
        }

        int size = targetArea.length - 1;
        // 是否闭合区域
        if (targetArea[0][0] != targetArea[size][0] || targetArea[0][1] != targetArea[size][1]) {
            return false;
        }

        boolean flag = false;
        double x1, y1, x2, y2;
        for (int i = 0; i < size; i++) {
            x1 = targetArea[i][0];
            y1 = targetArea[i][1];
            x2 = targetArea[i + 1][0];
            y2 = targetArea[i + 1][1];

            if (((y2 <= y && y < y1) || (y1 <= y && y < y2))
                    && x < ((x1 - x2) * (y - y2) / (y1 - y2) + x2)) {
                flag = !flag;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        double [ ][ ]  arr={{0,0},{0,3},{3,3},{3,0},{0,0}};
        System.out.println(AreaUtil.IsPtInArea(8,2,arr));
    }
}