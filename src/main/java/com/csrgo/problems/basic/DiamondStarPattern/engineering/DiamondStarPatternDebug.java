// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DiamondStarPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/diamond-star-pattern/
public class DiamondStarPatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= spaces; sp++) {
                sb.append("\t");
            }
            for (int st = 1; st <= stars; st++) {
                sb.append("*\t");
            }
            sb.append("\n");
            if (i <= n / 2) {
                spaces = spaces - 1;
                stars = stars + 1;
            } else {
                spaces = spaces + 1;
                stars = stars - 1;
            }
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Diamond Star Pattern (DEBUG) ====");
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
