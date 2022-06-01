package com.cskaoyan.java41.sx.day010;

import java.util.HashSet;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 * <p>
 * 如果 n 是快乐数就返回 True ；不是，则返回 False
 *
 * @author sx
 * @since 2022/04/27 21:08
 */

public class HappyNum {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static public boolean isHappy(int n) {
        int m = n;
        int[] count;
        HashSet<Integer> set = new HashSet<Integer>();
        while (n != 1 ) {
            set.add(n);
            count = getNum(n);
            n = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    n += count[i] * i * i;
                }
            }
            if (n == m || set.contains(n)) {
                return false;
            }
        }
        return true;

    }

    private static int[] getNum(int num) {
        int[] count = new int[10];
        int i;
        while (num != 0) {
            i = num % 10;
            count[i] += 1;
            num /= 10;
        }
        return count;
    }
}
