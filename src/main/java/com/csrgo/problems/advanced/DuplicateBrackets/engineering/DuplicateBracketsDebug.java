// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DuplicateBrackets.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/duplicate-brackets/
public class DuplicateBracketsDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= s.length(); i = i + 1) {
            char ch = s.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count = count + 1;
                }
                if (count > 0 && !stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Duplicate Brackets (DEBUG) ====");
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
