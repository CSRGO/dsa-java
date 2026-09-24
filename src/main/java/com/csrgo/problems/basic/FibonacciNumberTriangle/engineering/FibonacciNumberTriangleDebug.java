// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FibonacciNumberTriangle.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/fibonacci-number-triangle/
public class FibonacciNumberTriangleDebug {

    // TODO: debug this method to fix it
    public static String solve(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            long a = 0;
            long b = 1;
            for (int j = 1; j <= i; j++) {
                sb.append(a);
                long next = a + b;
                a = b;
                b = next;
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Fibonacci Number Triangle (DEBUG) ====");
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
