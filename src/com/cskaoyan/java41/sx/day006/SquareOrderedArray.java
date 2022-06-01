package com.cskaoyan.java41.sx.day006;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class SquareOrderedArray {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
       /* int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                count++;
            }
        }
        int[] a = new int[nums.length];
        int left = count - 1;
        int right = count;
        for (int i = 0; i < nums.length; i++) {
            if (left < 0){

            }
        }*/

        //从两头开始排序无需判断正负
        int left = 0;
        int right = nums.length - 1;
        int[] a = new int[nums.length];
        int i = nums.length - 1;
        while (right >= left){
            if (nums[right] * nums[right]> nums[left] * nums[left]){
                a[i] = nums[right] * nums[right];
                i--;
                right--;
            }else {
                a[i] = nums[left] * nums[left];
                i--;
                left++;
            }
        }
        return a;
    }
}
