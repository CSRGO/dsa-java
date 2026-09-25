// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AnyBaseToAnyBase.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/any-base-to-any-base/
public class AnyBaseToAnyBase {

    public static long solve(long n, int b1, int b2) {
        // TODO: write your logic here
        return 0L;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Any Base to Any Base ====");
        System.out.print("Enter number n in base b1: ");
        long n = sc.nextLong();
        System.out.print("Enter source base b1 (2-10): ");
        int b1 = sc.nextInt();
        System.out.print("Enter target base b2 (2-10): ");
        int b2 = sc.nextInt();
        
        long result = solve(n, b1, b2);
        
        System.out.println("------------------------");
        System.out.println("Input  : n=" + n + ", b1=" + b1 + ", b2=" + b2);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
