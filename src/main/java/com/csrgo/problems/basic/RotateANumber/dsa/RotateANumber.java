// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.RotateANumber.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/rotate-a-number/
public class RotateANumber {

    public static int solve(int n, int k) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Rotate a Number ====");
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
