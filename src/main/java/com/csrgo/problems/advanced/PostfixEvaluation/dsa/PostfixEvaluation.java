// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PostfixEvaluation.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/postfix-evaluation/
public class PostfixEvaluation {

    public static int solve(String exp) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Postfix Evaluation ====");
        System.out.print("Enter postfix expression: ");
        String exp = sc.nextLine();

        int result = solve(exp);

        System.out.println("------------------------");
        System.out.println("Input  : " + exp);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
