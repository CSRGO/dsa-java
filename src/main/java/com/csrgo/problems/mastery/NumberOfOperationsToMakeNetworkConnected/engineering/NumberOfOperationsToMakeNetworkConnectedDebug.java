// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfOperationsToMakeNetworkConnected.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/number-of-operations-to-make-network-connected/
public class NumberOfOperationsToMakeNetworkConnectedDebug {

    // TODO: debug this method to fix it
    public static int solve(int n, int[][] connections) {
        if (connections.length < n) {
            return -1;
        }

        int[] parent = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            parent[i] = i;
        }

        int components = n;
        for (int i = 0; i < connections.length; i = i + 1) {
            int rootU = find(parent, connections[i][0]);
            int rootV = find(parent, connections[i][1]);

            if (rootU != rootV) {
                parent[rootU] = rootV;
                components = components - 1;
            }
        }

        return components;
    }

    private static int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Number of Operations to Make Network Connected (DEBUG) ====");
        System.out.print("Enter number of computers n: ");
        int n = sc.nextInt();
        System.out.print("Enter number of connections m: ");
        int m = sc.nextInt();
        int[][] connections = new int[m][2];
        for (int i = 0; i < m; i = i + 1) {
            connections[i][0] = sc.nextInt();
            connections[i][1] = sc.nextInt();
        }

        int result = solve(n, connections);

        System.out.println("------------------------");
        System.out.println("Computers : " + n);
        System.out.println("Output    : " + result);
        System.out.println("========================");

        sc.close();
    }
}
