package com.cskaoyan.java41.sx.day008;

import java.util.Arrays;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * <p>
 * 示例:
 * <p>
 * 输入: 3 输出: [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
 */

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr = generateMatrix(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ,");
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        //定义循环圈数
        int loop = n / 2;
        //定义中心点位
        int mid = n / 2;
        //定义每次循环起始位置
        int startX = 0;
        int startY = 0;
        //定义偏移量
        int offset = 1;
        //定义填充数字
        int count = 1;

        while (loop > 0) {
            //定义变量记录startX和startY
            int i = startX;
            int j = startY;

            //上侧从左到右
            for (; j < startY + n - offset; j++) {
                arr[startX][j] = count++;
            }
            //右侧从上到下
            for (; i < startX + n - offset; i++) {
                arr[i][j] = count++;
            }
            //下侧从右到左
            for (; j > startY; j--) {
                arr[i][j] = count++;
            }
            //左侧从下到上
            for (; i > startX; i--) {
                arr[i][j] = count++;
            }
            loop--;
            startX += 1;
            startY += 1;
            offset += 2;
        }
        if (n % 2 == 1) {
            arr[mid][mid] = n * n;
        }
        return arr;
    }
}
