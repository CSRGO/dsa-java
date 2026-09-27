// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BalancedBrackets.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/balanced-brackets/
public class BalancedBracketsDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s) {
        if (s.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i = i + 1) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() == '[') {
                    return false;
                }
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (ch == ']') {
                if (stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.size() <= 1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Balanced Brackets (DEBUG) ====");
        System.out.print("Enter expression string: ");
        String s = sc.nextLine();

        boolean result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input  : " + s);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
