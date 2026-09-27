// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinStack.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/min-stack/
public class MinStack {

    public static List<Integer> solve(String[] operations) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Min Stack ====");
        System.out.print("Enter number of operations n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] operations = new String[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter operation " + (i + 1) + ": ");
            operations[i] = sc.nextLine();
        }

        List<Integer> result = solve(operations);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(operations));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}
