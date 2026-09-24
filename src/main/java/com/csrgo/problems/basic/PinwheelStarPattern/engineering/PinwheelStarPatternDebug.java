// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PinwheelStarPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/pinwheel-star-pattern/
public class PinwheelStarPatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean isStar = false;
                if (i == mid) {
                    isStar = true;
                } else if (i == 1 && j <= mid) {
                    isStar = true;
                } else if (j == n && i <= mid) {
                    isStar = true;
                } else if (j == 1 && i >= mid) {
                    isStar = true;
                } else if (i == n && j >= mid) {
                    isStar = true;
                }
                if (isStar) {
                    sb.append("*");
                }
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Pinwheel Star Pattern (DEBUG) ====");
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
