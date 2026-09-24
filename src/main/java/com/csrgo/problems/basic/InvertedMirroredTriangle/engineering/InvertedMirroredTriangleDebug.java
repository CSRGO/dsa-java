// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InvertedMirroredTriangle.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/inverted-mirrored-triangle/
public class InvertedMirroredTriangleDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int spaces = i;
            int stars = n - i + 1;
            for (int sp = 1; sp <= spaces; sp++) {
                sb.append("\t");
            }
            for (int st = 1; st <= stars; st++) {
                sb.append("*\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Inverted Mirrored Triangle (DEBUG) ====");
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
