package Leetcode.Hard.Longest_Valid_Parentheses;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int biggest = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    biggest = Math.max(biggest, i - stack.peek());
                }
            }
        }

        return biggest;
    }
}
