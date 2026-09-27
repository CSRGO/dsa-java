// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.InfixConversions.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/infix-conversions/
public class InfixConversionsDebug {

    // TODO: debug this method to fix it
    public static String[] solve(String exp) {
        Stack<Character> operators = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        for (int i = 0; i < exp.length(); i = i + 1) {
            char ch = exp.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isLetterOrDigit(ch)) {
                postfix.push(String.valueOf(ch));
                prefix.push(String.valueOf(ch));
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    process(operators, postfix, prefix);
                }
                if (!operators.isEmpty()) {
                    operators.pop();
                }
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) > precedence(ch)) {
                    process(operators, postfix, prefix);
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            process(operators, postfix, prefix);
        }
        return new String[]{prefix.peek(), postfix.peek()};
    }

    private static void process(Stack<Character> operators, Stack<String> postfix, Stack<String> prefix) {
        char op = operators.pop();
        String postV2 = postfix.pop();
        String postV1 = postfix.pop();
        postfix.push(postV1 + postV2 + op);

        String preV2 = prefix.pop();
        String preV1 = prefix.pop();
        prefix.push(op + preV2 + preV1);
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

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Infix Conversions (DEBUG) ====");
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();

        String[] result = solve(exp);

        System.out.println("------------------------");
        System.out.println("Input  : " + exp);
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
