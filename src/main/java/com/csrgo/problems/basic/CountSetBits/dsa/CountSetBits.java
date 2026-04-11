// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.CountSetBits.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-set-bits/
public class CountSetBits {

    public static int solve(int n) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Set Bits ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        int result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input    : " + n);
        System.out.println("Set Bits : " + result);
        System.out.println("========================");
    }
}
