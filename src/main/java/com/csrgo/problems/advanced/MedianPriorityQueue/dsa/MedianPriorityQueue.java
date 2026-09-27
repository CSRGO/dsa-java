// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MedianPriorityQueue.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/median-priority-queue/
public class MedianPriorityQueue {

    public static int[] solve(String[] operations, int[] values) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Median Priority Queue ====");
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        String[] operations = new String[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Operation " + (i + 1) + " (add/peek/remove): ");
            operations[i] = sc.next();
            if (operations[i].equals("add")) {
                values[i] = sc.nextInt();
            } else {
                values[i] = 0;
            }
        }

        int[] result = solve(operations, values);

        System.out.println("------------------------");
        System.out.println("Operation Results: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
