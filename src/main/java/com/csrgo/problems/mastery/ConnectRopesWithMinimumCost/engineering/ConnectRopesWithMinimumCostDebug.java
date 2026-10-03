// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConnectRopesWithMinimumCost.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/connect-ropes-with-minimum-cost/
public class ConnectRopesWithMinimumCostDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i = i + 1) {
            pq.offer(arr[i]);
        }

        int totalCost = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int combined = first + second;
            totalCost = totalCost + first;
            pq.offer(combined);
        }

        return totalCost;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Connect Ropes with Minimum Cost (Debug) ====");
        System.out.print("Enter number of ropes n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter rope length " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Ropes        : " + Arrays.toString(arr));
        System.out.println("Minimum Cost : " + result);
        System.out.println("========================");

        sc.close();
    }
}
