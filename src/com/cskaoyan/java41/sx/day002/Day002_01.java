package com.cskaoyan.java41.sx.day002;

import java.util.Arrays;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Day002_01 {
    public static void main(String[] args) {
        int[] num1 = {1, 3,5,7,9,45};
        int[] num2 = {3, 4};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] arr = new double[nums1.length + nums2.length];
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        for (; i < nums1.length + nums2.length; i++) {
            if (count1 ==nums1.length){
                arr[i] = nums2[count2];
                count2++;
                continue;
            }
            if (count2 ==nums2.length){
                arr[i] = nums1[count1];
                count1++;
                continue;
            }
            if (nums1[count1] < nums2[count2]) {
                arr[i] = nums1[count1];
                count1++;
            } else {
                arr[i] = nums2[count2];
                count2++;
            }
        }
        System.out.println(Arrays.toString(arr));
        double v = arr[(nums1.length + nums2.length) / 2];
        if ((nums1.length + nums2.length) % 2 == 1) {
            return v;
        } else {
            return (arr[(nums1.length + nums2.length)/2-1] + v) / 2;
        }

    }
}
