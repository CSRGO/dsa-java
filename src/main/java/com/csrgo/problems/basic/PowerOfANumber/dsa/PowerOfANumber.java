// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PowerOfANumber.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/power-of-a-number/
public class PowerOfANumber {

    public static long solve(int x, int n) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Power of a Number ====");
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
