// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.InfixEvaluation.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/infix-evaluation/
public class InfixEvaluationDebug {

    // TODO: debug this method to fix it
    public static int solve(String exp) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int i = 0;
        while (i < exp.length()) {
            char ch = exp.charAt(i);
            if (ch == ' ') {
                i = i + 1;
                continue;
            }
            if (Character.isDigit(ch)) {
                operands.push(ch - '0');
                i = i + 1;
            } else if (ch == '(') {
                operators.push(ch);
                i = i + 1;
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    operands.push(applyOp(v2, v1, op));
                }
                if (!operators.isEmpty()) {
                    operators.pop();
                }
                i = i + 1;
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) > precedence(ch)) {
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    operands.push(applyOp(v2, v1, op));
                }
                operators.push(ch);
                i = i + 1;
            } else {
                i = i + 1;
            }
        }
        while (!operators.isEmpty()) {
            char op = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            operands.push(applyOp(v2, v1, op));
        }
        return operands.peek();
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    private static int applyOp(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        }
        if (op == '-') {
            return a - b;
        }
        if (op == '*') {
            return a * b;
        }
        if (op == '/') {
            return a / b;
        }
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Infix Evaluation (DEBUG) ====");
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();

        int result = solve(exp);

        System.out.println("------------------------");
        System.out.println("Input  : " + exp);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
