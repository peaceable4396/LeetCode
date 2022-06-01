package com.cskaoyan.java41.sx.day010;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1: 输入: s = "anagram", t = "nagaram" 输出: true
 *
 * 示例 2: 输入: s = "rat", t = "car" 输出: false
 *
 * 说明: 你可以假设字符串只包含小写字母。
 * @author sx
 * @since 2022/04/27 20:41
 */

public class LetterEctopicWord {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char cc : t.toCharArray()) {
            record[cc - 'a'] -= 1;
        }
        for (int i : record) {
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
