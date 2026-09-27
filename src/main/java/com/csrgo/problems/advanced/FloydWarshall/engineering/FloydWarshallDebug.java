// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FloydWarshall.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/floyd-warshall/
public class FloydWarshallDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] matrix) {
        int n = matrix.length;
        int INF = 100000000;

        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1 && i != j) {
                    dist[i][j] = INF;
                } else {
                    dist[i][j] = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] > INF) {
                    dist[i][j] = -1;
                }
            }
        }

        return dist;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Floyd-Warshall Algorithm (DEBUG) ====");
        System.out.print("Enter number of vertices n: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter adjacency matrix (" + n + " x " + n + ", use -1 for no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] result = solve(matrix);

        System.out.println("------------------------");
        System.out.println("All-Pairs Shortest Paths Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("========================");

        scanner.close();
    }
}
