package com.cskaoyan.java41.sx.day028;

/**
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回滑动窗口中的最大值。
 *
 * 进阶：
 *
 * 你能在线性时间复杂度内解决此题吗？
 * @author sx
 * @since 2022/05/16 14:24
 */

public class MaximumSlidingWindow {
    public static void main(String[] args) {

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int j = 0;
        result[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            result[j] = Math.max(result[j], nums[i]);
            
        }
        return null;
    }

}
