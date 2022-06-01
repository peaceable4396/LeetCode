package com.cskaoyan.java41.sx.day002;

import java.util.Scanner;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Day002_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digitalReversal(num));
    }

    private static int digitalReversal(int num) {
        int res = 0;
        int temp = 0;
        while (num != 0) {
            temp = num % 10;
            //判断是否溢出2^32-1
            if (res > 214748364 || (res == 214748364 && temp > 7)) {
                return 0;
            }
            if (res < -214748364 || (res == -214748364 && temp < -8)) {
                return 0;
            }
            res = res * 10 + temp;
            num /= 10;
        }
        return res;
    }
}
