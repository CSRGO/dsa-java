// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.XStarPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/x-star-pattern/
public class XStarPatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int lastCol = Math.max(i, n - i + 1);
            for (int j = 1; j <= lastCol; j++) {
                if (i == j && i + j == n + 1) {
                    sb.append("*\t");
                } else {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== X Star Pattern (DEBUG) ====");
        System.out.print("Enter odd number n: ");
        int n = sc.nextInt();
        
        String result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output :");
        System.out.print(result);
        System.out.println("========================");
    }
}
