// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PrintAllPrimesTillN.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/print-all-primes-till-n/
public class PrintAllPrimesTillNDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        if (n < 0) {
            return null;
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Print All Primes Till N ====");
        System.out.print("Enter limit (n): ");
        int n = sc.nextInt();
        
        List<Integer> result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + n);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}
