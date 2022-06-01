package com.cskaoyan.java41.sx.day010;

/**
 * 题意：给定两个数组，编写一个函数来计算它们的交集。
 * @author sx
 * @since 2022/04/27 20:56
 */

public class ArrayOverlap {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] i = new int[1001];
        int[] j = new int[1001];
        for (int i1 : nums1) {
            if (i[i1] == 0){
                i[i1] += 1;
            }
        }
        for (int i2 : nums2) {
            if (j[i2] == 0){
                j[i2] += 1;
            }
        }
        int count = 0;
        for (int k = 0; k < 1001; k++) {
            if (i[k] == 1 && j[k] ==1){
                count++;
            }
        }
        int[] num = new int[count];
        int temp = 0;
        for (int k = 0; k < 1001; k++) {
            if (i[k] == 1 && j[k] ==1){
                num[temp] = k;
                temp++;
            }
        }
        return num;

    }
}
