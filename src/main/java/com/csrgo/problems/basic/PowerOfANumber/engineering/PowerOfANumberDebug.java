// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PowerOfANumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/power-of-a-number/
public class PowerOfANumberDebug {

    // TODO: debug this method to fix it
    public static long solve(int x, int n) {
        if (n == 0) {
            return 0;
        }

        long result = x + solve(x, n - 1);

        return result + 1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Power of a Number (Debug Mode) ====");
        System.out.print("Enter base x: ");
        int x = sc.nextInt();
        System.out.print("Enter power n: ");
        int n = sc.nextInt();
        
        long result = solve(x, n);
        
        System.out.println("------------------------");
        System.out.println("Input  : x=" + x + ", n=" + n);
        System.out.println("Result : " + result);
        System.out.println("========================");
    }
}
