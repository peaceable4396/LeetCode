package com.cskaoyan.java41.sx.day028;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 *
 * @author sx
 * @since 2022/05/16 09:25
 */

public class StackExcersice {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        if(s == null){
            return false;
        }
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c1 : c) {
            if (c1 == '(' || c1 == '{' || c1 == '['){
                stack.push(c1);
            }
            if (c1 == ')'){
                if (stack.isEmpty())return false;
                Character pop = stack.pop();
                if (pop != '('){
                    return false;
                }
            } else if (c1 == '}'){
                if (stack.isEmpty())return false;
                Character pop = stack.pop();
                if (pop != '{'){
                    return false;
                }
            }else if (c1 == ']'){
                if (stack.isEmpty())return false;
                Character pop = stack.pop();
                if (pop != '['){
                    return false;
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

}

