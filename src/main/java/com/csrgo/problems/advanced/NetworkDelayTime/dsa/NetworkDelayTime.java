// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NetworkDelayTime.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/network-delay-time/
public class NetworkDelayTime {

    public static int solve(int[][] times, int n, int k) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Network Delay Time ====");
        System.out.print("Enter total number of nodes n: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of directed edges: ");
        int e = scanner.nextInt();
        int[][] times = new int[e][3];
        System.out.println("Enter " + e + " directed edges (u v time):");
        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + " (u v time): ");
            times[i][0] = scanner.nextInt();
            times[i][1] = scanner.nextInt();
            times[i][2] = scanner.nextInt();
        }
        System.out.print("Enter source signal node k: ");
        int k = scanner.nextInt();

        int result = solve(times, n, k);

        System.out.println("------------------------");
        System.out.println("Minimum Time For All Nodes: " + result);
        System.out.println("========================");

        scanner.close();
    }
}
