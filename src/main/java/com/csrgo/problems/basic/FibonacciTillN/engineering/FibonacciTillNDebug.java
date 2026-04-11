// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FibonacciTillN.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/fibonacci-till-n/
public class FibonacciTillNDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        List<Integer> fib = new ArrayList<>();
        
        if (n == 0) return fib;
        
        fib.add(0);
        fib.add(1);
        
        for (int i = 2; i <= n; i++) {
            int nextValue = fib.get(i - 1) + fib.get(i - 2);
            fib.add(nextValue);
        }
        
        return fib;
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
