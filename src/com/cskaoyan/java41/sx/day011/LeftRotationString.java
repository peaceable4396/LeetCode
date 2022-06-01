package com.cskaoyan.java41.sx.day011;

/**
 * @author sx
 * @since 2022/04/28 14:20
 */

public class LeftRotationString {
    public static void main(String[] args) {

    }
    public String reverseLeftWords(String s, int n) {
        //申请一个额外的空间
        // StringBuffer sb = new StringBuffer();
        // return sb.append(s.substring(n,s.length())).append(s.substring(0,n)).toString();

        //不申请额外空间，不使用自身库函数
        //团团转起来了
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return s;
    }

}
