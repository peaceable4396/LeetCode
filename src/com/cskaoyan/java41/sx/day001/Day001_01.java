package com.cskaoyan.java41.sx.day001;
/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */

import java.util.HashSet;
import java.util.Scanner;

public class Day001_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> sites = new HashSet<>();
        //设置左右指针
        int left = 0;
        int right = 0;
        int max = 0;
        /*
        右指针指向的字符依次进入HashSet
        不能进入说明HashSet中的首位跟当前右指针指向的相同
        此时左指针左移
         */
        for (; right < s.length(); right++) {
            char temp = s.charAt(right);
            while (sites.contains(temp)) {
                sites.remove(s.charAt(left));
                left++;
            }
            sites.add(temp);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}
