// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PrimeFactorization.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/prime-factorization/
public class PrimeFactorizationDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int div = 2; div * div < n; div = div + 1) {
            if (n % div == 0) {
                n = n / div;
                factors.add(div);
            }
        }

        return factors;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Prime Factorization (Debug Mode) ====");
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        List<Integer> result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
