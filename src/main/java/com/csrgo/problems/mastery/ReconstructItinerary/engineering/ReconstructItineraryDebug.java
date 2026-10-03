// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReconstructItinerary.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reconstruct-itinerary/
public class ReconstructItineraryDebug {

    // TODO: debug this method to fix it
    public static String[] solve(String[][] tickets) {
        Map<String, ArrayDeque<String>> graph = new HashMap<>();

        for (int i = 0; i < tickets.length; i = i + 1) {
            String from = tickets[i][0];
            String to = tickets[i][1];

            if (!graph.containsKey(from)) {
                graph.put(from, new ArrayDeque<>());
            }
            graph.get(from).add(to);
        }

        List<String> route = new ArrayList<>();
        dfs("JFK", graph, route);

        return route.toArray(new String[0]);
    }

    private static void dfs(String airport, Map<String, ArrayDeque<String>> graph, List<String> route) {
        route.add(airport);
        ArrayDeque<String> neighbors = graph.get(airport);
        while (neighbors != null && !neighbors.isEmpty()) {
            String next = neighbors.poll();
            dfs(next, graph, route);
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reconstruct Itinerary Debug ====");
        System.out.print("Enter number of tickets n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        String[][] tickets = new String[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter departure airport for ticket " + (i + 1) + ": ");
            tickets[i][0] = sc.nextLine().trim().toUpperCase();
            System.out.print("Enter arrival airport for ticket " + (i + 1) + ": ");
            tickets[i][1] = sc.nextLine().trim().toUpperCase();
        }

        String[] itinerary = solve(tickets);
        System.out.println("Itinerary: " + Arrays.toString(itinerary));
    }
}
