package com.cskaoyan.java41.sx.day028;

import java.util.Stack;

/**
 * 根据 逆波兰表示法，求表达式的值。
 *
 * 有效的运算符包括 + ,  - ,  * ,  / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 *
 * 说明：
 *
 * 整数除法只保留整数部分。 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 *
 * 示例 1：
 *
 * 输入: ["2", "1", "+", "3", " * "]
 * 输出: 9
 * 解释: 该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 * 示例 2：
 *
 * 输入: ["4", "13", "5", "/", "+"]
 * 输出: 6
 * 解释: 该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6
 * 示例 3：
 *
 * 输入: ["10", "6", "9", "3", "+", "-11", " * ", "/", " * ", "17", "+", "5", "+"]
 *
 * 输出: 22
 * @author sx
 * @since 2022/05/16 14:08
 */

public class ReversePolishNotation {
    public static void main(String[] args) {

    }
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s) || "-".equals(s) ||"*".equals(s) ||"/".equals(s)){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                if ("+".equals(s)){
                    stack.push(String.valueOf(b + a));
                }
                if ("-".equals(s)){
                    stack.push(String.valueOf(b - a));
                }
                if ("*".equals(s)){
                    stack.push(String.valueOf(b * a));
                }
                if ("/".equals(s)){
                    stack.push(String.valueOf(b / a));
                }
            }else {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
