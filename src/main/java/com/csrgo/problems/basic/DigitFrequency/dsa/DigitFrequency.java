// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DigitFrequency.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/digit-frequency/
public class DigitFrequency {

    public static int solve(long n, int d) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Digit Frequency ====");
        System.out.print("Enter number n: ");
        long n = sc.nextLong();
        System.out.print("Enter digit d (0-9): ");
        int d = sc.nextInt();
        
        int result = solve(n, d);
        
        System.out.println("------------------------");
        System.out.println("Input  : n=" + n + ", d=" + d);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
