// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PowerOfFour.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/power-of-four/
public class PowerOfFourDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int n) {
        if (n <= 0) {
            return false;
        }

        if ((n & (n - 1)) != 0) {
            return false;
        }

        return (n & 0xAAAAAAAA) != 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = sc.nextInt();

        boolean result = solve(n);
        System.out.println("Is Power of Four (Debug): " + result);
        sc.close();
    }
}
