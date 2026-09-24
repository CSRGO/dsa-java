// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.HollowRhombusPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/hollow-rhombus-pattern/
public class HollowRhombusPatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            int dist = (i <= mid) ? (i - 1) : (n - i);
            int col1 = mid - dist;
            int col2 = mid + dist;
            for (int sp = 1; sp < col1; sp++) {
                sb.append("\t");
            }
            sb.append("*\t");
            for (int sp = 1; sp <= col2 - col1; sp++) {
                sb.append("\t");
            }
            sb.append("*\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Hollow Rhombus Pattern (DEBUG) ====");
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
