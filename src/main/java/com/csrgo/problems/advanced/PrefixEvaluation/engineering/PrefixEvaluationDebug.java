// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrefixEvaluation.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/prefix-evaluation/
public class PrefixEvaluationDebug {

    // TODO: debug this method to fix it
    public static int solve(String exp) {
        Stack<Integer> stack = new Stack<>();
        if (exp.contains(" ")) {
            String[] tokens = exp.trim().split("\\s+");
            for (int i = tokens.length - 1; i > 0; i = i - 1) {
                String token = tokens[i];
                if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                    int v1 = stack.pop();
                    int v2 = stack.pop();
                    stack.push(apply(v2, v1, token.charAt(0)));
                } else {
                    stack.push(Integer.parseInt(token));
                }
            }
        } else {
            for (int i = 0; i < exp.length(); i = i + 1) {
                char ch = exp.charAt(i);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    int v1 = stack.pop();
                    int v2 = stack.pop();
                    stack.push(apply(v1, v2, ch));
                } else {
                    stack.push(ch - '0');
                }
            }
        }
        return stack.isEmpty() ? 0 : stack.peek();
    }

    private static int apply(int v1, int v2, char op) {
        if (op == '+') {
            return v1 + v2;
        }
        if (op == '-') {
            return v1 - v2;
        }
        if (op == '*') {
            return v1 * v2;
        }
        if (op == '/') {
            return v1 / v2;
        }
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Prefix Evaluation (DEBUG) ====");
        System.out.print("Enter prefix expression: ");
        String exp = sc.nextLine();

        int result = solve(exp);

        System.out.println("------------------------");
        System.out.println("Input  : " + exp);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
