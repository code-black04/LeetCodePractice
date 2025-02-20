package main.java.easy;

import java.util.Stack;

/**
 * {@link https://leetcode.com/problems/valid-parentheses/description}
 */
public class ValidParentheses {

    public static void main(String[] args) {
        String s = "[({}){}]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            } else {
                if (!stack.empty()) {
                    char checkTemp = stack.pop();
                    if (temp == ')' && checkTemp != '(') return false;
                    if (temp == '}' && checkTemp != '{') return false;
                    if (temp == ']' && checkTemp != '[') return false;
                } else {
                    return false;
                }
            }
        }
        if (stack.empty())
            return true;
        else return false;
    }
}
