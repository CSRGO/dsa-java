// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.CountSetBits.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-set-bits/
public class CountSetBitsDebug {

    // TODO: debug this method to fix it
    public static int solve(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 1;

        while (n > 0) {
            n = n | (n - 1);
            n = n / 10;
            count++;
        }

        return count;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Set Bits (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        int result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input    : " + n);
        System.out.println("Set Bits : " + result);
        System.out.println("========================");
    }
}
