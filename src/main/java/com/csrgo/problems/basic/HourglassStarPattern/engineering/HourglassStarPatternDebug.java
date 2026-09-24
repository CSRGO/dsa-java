// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.HourglassStarPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/hourglass-star-pattern/
public class HourglassStarPatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    sb.append("*\t");
                }
            } else if (i <= mid) {
                for (int sp = 1; sp <= i - 1; sp++) {
                    sb.append("\t");
                }
                sb.append("*\t");
                int gap = n - 2 * i;
                for (int sp = 1; sp <= gap; sp++) {
                    sb.append("\t");
                }
                if (i != mid) {
                    sb.append("*\t");
                }
            } else {
                for (int sp = 1; sp <= n - i; sp++) {
                    sb.append("\t");
                }
                sb.append("*\t");
                int gap = 2 * (i - mid) - 1;
                for (int sp = 1; sp <= gap; sp++) {
                    sb.append("\t");
                }
                sb.append("*\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Hourglass Star Pattern (DEBUG) ====");
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
