package com.cskaoyan.java41.sx.day024;

import java.util.Arrays;

/**
 * @author sx
 * @since 2022/05/12 09:54
 */

public class KMP2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNext("abc")));
        System.out.println(Arrays.toString(getNext("abcabc")));
        System.out.println(Arrays.toString(getNext("abcabcabc")));
        System.out.println(Arrays.toString(getNext("abcabcabcabc")));
        System.out.println(Arrays.toString(getNext("abab")));
        String s = "abab";
        int length = s.length();
        int[] next = new int[length];
        next = getNext(s);
        int end = next[length - 1] + 1;
        int targetLength = length - end;
        if(end > 0 && end % targetLength == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static int[] getNext(String model){
        char[] c = model.toCharArray();
        int[] next = new int[c.length];
        int j = -1;
        next[0] = -1;
        for (int i = 1; i < c.length; i++) {
            while (j != -1 && c[i]!= c[j+1] ){
                j = next[j];
            }
            if (c[i] == c[j+1]){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
