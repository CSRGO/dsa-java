// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignHitCounter.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-hit-counter/
public class DesignHitCounterDebug {

    // TODO: debug this method to fix it
    public static int[] solve(String[] operations, int[] timestamps) {
        int[] times = new int[300];
        int[] hits = new int[300];

        int queryCount = 0;
        for (int i = 0; i < operations.length; i = i + 1) {
            if ("getHits".equals(operations[i])) {
                queryCount = queryCount + 1;
            }
        }

        int[] result = new int[queryCount];
        int resIdx = 0;

        for (int i = 0; i < operations.length; i = i + 1) {
            String op = operations[i];
            int t = timestamps[i];

            if ("hit".equals(op)) {
                int idx = t % 300;
                times[idx] = t;
                hits[idx] = hits[idx] + 1;
            } else if ("getHits".equals(op)) {
                int total = 0;
                for (int k = 0; k < 300; k = k + 1) {
                    if (t - times[k] <= 300) {
                        total = total + hits[k];
                    }
                }
                result[resIdx] = total;
                resIdx = resIdx + 1;
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Hit Counter (DEBUG) ====");
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
