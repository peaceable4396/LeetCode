package com.cskaoyan.java41.sx.day028;

import java.util.Stack;

/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 *
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 *
 * 示例：
 *
 * 输入："abbaca"
 * 输出："ca"
 * 解释：例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 * 提示：
 *
 * 1 <= S.length <= 20000
 * S 仅由小写英文字母组成。
 * @author sx
 * @since 2022/05/16 10:13
 */

public class DelRepeat {
    public static void main(String[] args) {
        String a = "abbaca";
        System.out.println(removeDuplicates(a));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if (stack.peek() == c){
                stack.pop();
            }else stack.push(c);
        }
        char[] temp = new char[stack.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = stack.pop();
        }
        String result = new String();
        for (int i = temp.length - 1; i >= 0; i--) {
            result += temp[i];
        }
        return result;
    }
}
