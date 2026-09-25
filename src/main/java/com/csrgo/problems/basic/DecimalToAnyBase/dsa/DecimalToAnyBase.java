// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DecimalToAnyBase.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decimal-to-any-base/
public class DecimalToAnyBase {

    public static long solve(int n, int b) {
        // TODO: write your logic here
        return 0L;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decimal to Any Base ====");
        System.out.print("Enter decimal number n: ");
        int n = sc.nextInt();
        System.out.print("Enter target base b (2-10): ");
        int b = sc.nextInt();
        
        long result = solve(n, b);
        
        System.out.println("------------------------");
        System.out.println("Input  : n=" + n + ", b=" + b);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
