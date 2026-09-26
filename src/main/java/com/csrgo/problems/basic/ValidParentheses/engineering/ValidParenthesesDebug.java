// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ValidParentheses.engineering;

import java.util.ArrayDeque;
import java.util.Deque;

// Problem Link: https://dsa.csrgo.com/problems/valid-parentheses/
public class ValidParenthesesDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                // Bug 1: Pushes ')' instead of ']' for opening square bracket
                stack.push(')');
            } else {
                // Bug 2: Fails to guard against empty stack before calling pop(), throwing exception
                char top = stack.pop();
                if (top != c) {
                    return false;
                }
            }
        }

        // Bug 3: Returns true unconditionally without verifying that stack is empty
        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result = solve(s);
        System.out.println("Result: " + result);
    }
}
