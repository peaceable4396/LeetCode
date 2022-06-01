package com.cskaoyan.java41.sx.day011;

/**
 * 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
 * <p>
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * <p>
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * <p>
 * 示例:
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 *
 * @author sx
 * @since 2022/04/28 08:46
 */

public class ReverseString {
    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {
        StringBuffer res = new StringBuffer();
        int start = 0;
        int length = s.length();
        while (start < length) {
            StringBuffer temp = new StringBuffer();
            int firstK = (start + k > length) ? length : start + k;
            int secondK = (start + 2 * k > length) ? length : start + 2 * k;
            //先拼接temp
            temp.append(s.substring(start, firstK));
            //用res拼接反转后的temp
            res.append(temp.reverse());

            if (secondK > firstK) {
                res.append(s.substring(firstK, secondK));
            }
            start += 2 * k;
        }
        return res.toString();
    }
}
