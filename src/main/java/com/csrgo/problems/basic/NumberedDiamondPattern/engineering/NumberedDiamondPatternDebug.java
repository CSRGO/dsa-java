// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.NumberedDiamondPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/numbered-diamond-pattern/
public class NumberedDiamondPatternDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            int r = (i <= mid) ? i : (n - i + 1);
            for (int sp = 1; sp <= mid - r; sp++) {
                sb.append("\t");
            }
            int val = r;
            int count = 2 * r - 1;
            for (int j = 1; j <= count; j++) {
                sb.append(val).append("\t");
                val++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Numbered Diamond Pattern (DEBUG) ====");
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
