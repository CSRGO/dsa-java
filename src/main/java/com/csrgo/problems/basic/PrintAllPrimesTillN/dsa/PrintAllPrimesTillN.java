// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PrintAllPrimesTillN.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/print-all-primes-till-n/
public class PrintAllPrimesTillN {

    public static List<Integer> solve(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 1) return primes;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
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
