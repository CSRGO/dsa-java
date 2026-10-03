// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NumberOfOperationsToMakeNetworkConnected.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/number-of-operations-to-make-network-connected/
public class NumberOfOperationsToMakeNetworkConnected {

    public static int solve(int n, int[][] connections) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Number of Operations to Make Network Connected ====");
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
