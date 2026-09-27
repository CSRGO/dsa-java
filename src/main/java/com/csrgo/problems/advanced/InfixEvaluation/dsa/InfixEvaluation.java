// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.InfixEvaluation.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/infix-evaluation/
public class InfixEvaluation {

    public static int solve(String exp) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Infix Evaluation ====");
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
