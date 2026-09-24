// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PascalNumberTriangle.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/pascal-number-triangle/
public class PascalNumberTriangleDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long val = 1;
            for (int k = 0; k <= i; k++) {
                sb.append(val);
                val = (val / (k + 1)) * (i - k);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Pascal Number Triangle (DEBUG) ====");
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
