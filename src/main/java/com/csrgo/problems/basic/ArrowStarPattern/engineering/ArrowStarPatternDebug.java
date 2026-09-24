// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ArrowStarPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/arrow-star-pattern/
public class ArrowStarPatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= mid - 1; sp++) {
                sb.append("\t");
            }
            int k = (i == mid) ? n : ((i < mid) ? i : (n - i + 1));
            for (int st = 1; st <= k; st++) {
                sb.append("*\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Arrow Star Pattern (DEBUG) ====");
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
