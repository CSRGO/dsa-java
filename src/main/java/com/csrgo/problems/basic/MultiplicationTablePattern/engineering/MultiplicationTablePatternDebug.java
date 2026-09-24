// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MultiplicationTablePattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/multiplication-table-pattern/
public class MultiplicationTablePatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            sb.append(n).append("*").append(i).append("=").append(n * i).append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Multiplication Table Pattern (DEBUG) ====");
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
