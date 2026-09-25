// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseToDecimal.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/any-base-to-decimal/
public class AnyBaseToDecimal {

    public static int solve(long n, int b) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Any Base to Decimal ====");
        System.out.print("Enter number n in base b: ");
        long n = sc.nextLong();
        System.out.print("Enter source base b (2-10): ");
        int b = sc.nextInt();
        
        int result = solve(n, b);
        
        System.out.println("------------------------");
        System.out.println("Input   : n=" + n + ", b=" + b);
        System.out.println("Decimal : " + result);
        System.out.println("========================");
    }
}
