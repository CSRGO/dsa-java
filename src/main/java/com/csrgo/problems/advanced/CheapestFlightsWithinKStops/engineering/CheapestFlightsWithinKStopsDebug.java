// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CheapestFlightsWithinKStops.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/cheapest-flights-within-k-stops/
public class CheapestFlightsWithinKStopsDebug {

    // TODO: debug this method to fix it
    public static int solve(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        int INF = 100000000;
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int step = 0; step < k; step++) {
            for (int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int price = flight[2];

                if (dist[u] != INF && dist[u] + price < dist[v]) {
                    dist[v] = dist[u] + price;
                }
            }
        }

        return dist[dst] > INF ? -1 : dist[dst];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Cheapest Flights Within K Stops (DEBUG) ====");
        System.out.print("Enter number of cities n: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of flights: ");
        int e = scanner.nextInt();
        int[][] flights = new int[e][3];
        System.out.println("Enter " + e + " flights (from to price):");
        for (int i = 0; i < e; i++) {
            System.out.print("Flight " + (i + 1) + " (from to price): ");
            flights[i][0] = scanner.nextInt();
            flights[i][1] = scanner.nextInt();
            flights[i][2] = scanner.nextInt();
        }
        System.out.print("Enter source city src: ");
        int src = scanner.nextInt();
        System.out.print("Enter destination city dst: ");
        int dst = scanner.nextInt();
        System.out.print("Enter maximum allowed stops k: ");
        int k = scanner.nextInt();

        int result = solve(n, flights, src, dst, k);

        System.out.println("------------------------");
        System.out.println("Cheapest Price: " + result);
        System.out.println("========================");

        scanner.close();
    }
}
