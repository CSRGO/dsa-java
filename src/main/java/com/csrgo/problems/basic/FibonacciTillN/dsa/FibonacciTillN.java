// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FibonacciTillN.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/fibonacci-till-n/
public class FibonacciTillN {

    public static List<Integer> solve(int n) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Fibonacci Till N ====");
        System.out.print("Enter limit (n): ");
        int n = sc.nextInt();
        
        List<Integer> result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
