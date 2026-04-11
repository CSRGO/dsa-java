// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.RotateANumber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/rotate-a-number/
public class RotateANumberDebug {

    // TODO: debug this method to fix it
    public static int solve(int n, int k) {
        int temp = n;
        int len = 0;
        while (temp > 0) {
            temp = temp / 10;
            len = len + 1;
        }

        k = k % len;

        int div = 1;
        int mult = 0;
        for (int i = 1; i <= len; i = i + 1) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        return (r * div) + q;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Rotate a Number (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        System.out.print("Enter rotation k: ");
        int k = sc.nextInt();
        
        int result = solve(n, k);
        
        System.out.println("------------------------");
        System.out.println("Input  : n=" + n + ", k=" + k);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
