// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SymmetricNumberValley.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/symmetric-number-valley/
public class SymmetricNumberValleyDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j).append("\t");
            }
            int gap = 2 * (n - i);
            for (int g = 1; g <= gap; g++) {
                sb.append("\t");
            }
            for (int j = i; j >= 1; j--) {
                sb.append(j).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Symmetric Number Valley (DEBUG) ====");
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
