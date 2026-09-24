// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DiagonalLinePattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/diagonal-line-pattern/
public class DiagonalLinePatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int spaces = i;
            for (int sp = 1; sp <= spaces; sp++) {
                sb.append("\t");
            }
            sb.append("*\t");
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Diagonal Line Pattern (DEBUG) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        String result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output :");
        System.out.print(result);
        System.out.println("========================");
    }
}
