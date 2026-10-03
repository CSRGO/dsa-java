// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignHitCounter.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-hit-counter/
public class DesignHitCounter {

    public static int[] solve(String[] operations, int[] timestamps) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Hit Counter ====");
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        String[] operations = new String[n];
        int[] timestamps = new int[n];
        System.out.println("Enter operation and timestamp per line:");
        for (int i = 0; i < n; i = i + 1) {
            operations[i] = sc.next();
            timestamps[i] = sc.nextInt();
        }

        int[] result = solve(operations, timestamps);

        System.out.println("------------------------");
        System.out.println("Query Results: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
