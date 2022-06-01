package com.cskaoyan.java41.sx.day002;

/**
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * <p>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 返回容器可以储存的最大水量。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Day002_02 {
    public static void main(String[] args) {
        int[] height = {1, 1};
        System.out.println(maxArea(height));
    }

    //暴力解法
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, ((Math.min(height[i], height[j])) * (j - i)));
            }
        }
        return max;
    }

    /*
    聪明解法
    双指针
在每个状态下，无论长板或短板向中间收窄一格，都会导致水槽 底边宽度 -1−1​ 变短：

若向内 移动短板 ，水槽的短板 min(h[i], h[j])min(h[i],h[j]) 可能变大，因此下个水槽的面积 可能增大 。
若向内 移动长板 ，水槽的短板 min(h[i], h[j])min(h[i],h[j])​ 不变或变小，因此下个水槽的面积 一定变小 。
因此，初始化双指针分列水槽左右两端，循环每轮将短板向内移动一格，并更新面积最大值，直到两指针相遇时跳出；即可获得最大面积。

作者：jyd
链接：https://leetcode-cn.com/problems/container-with-most-water/solution/container-with-most-water-shuang-zhi-zhen-fa-yi-do/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public static int maxArea2(int[] height) {
        int head = 0;
        int tail = height.length - 1;
        int max = 0;
        while (head < tail) {
            // if (height[head] < height[tail]) {
            //     head++;
            // } else {
            //     tail--;
            // }
            // max = Math.max(max, ((Math.min(height[head], height[tail])) * (tail - head)));
            // 美化
            max = height[head]<height[tail]?
                    Math.max(max,(tail-head)*height[head++]):
                    Math.max(max,(tail-head)*height[tail++]);
        }
        return max;
    }
}
