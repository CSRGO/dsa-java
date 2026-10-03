// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.EvaluateDivision.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/evaluate-division/
public class EvaluateDivisionDebug {

    static class Edge {
        String node;
        double weight;

        Edge(String node, double weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    // TODO: debug this method to fix it
    public static double[] solve(String[][] equations, double[] values, String[][] queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.length; i = i + 1) {
            String u = equations[i][0];
            String v = equations[i][1];
            double val = values[i];

            if (!graph.containsKey(u)) {
                graph.put(u, new HashMap<>());
            }
            if (!graph.containsKey(v)) {
                graph.put(v, new HashMap<>());
            }

            graph.get(u).put(v, val);
            graph.get(v).put(u, val);
        }

        double[] results = new double[queries.length];

        for (int i = 0; i < queries.length; i = i + 1) {
            String start = queries[i][0];
            String end = queries[i][1];

            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                results[i] = -1.0;
            } else if (start.equals(end)) {
                results[i] = 0.0;
            } else {
                results[i] = bfs(graph, start, end);
            }
        }

        return results;
    }

    private static double bfs(Map<String, Map<String, Double>> graph, String start, String target) {
        Queue<Edge> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        queue.add(new Edge(start, 1.0));
        visited.add(start);

        while (!queue.isEmpty()) {
            Edge current = queue.poll();

            if (current.node.equals(target)) {
                return current.weight;
            }

            Map<String, Double> neighbors = graph.get(current.node);
            if (neighbors != null) {
                for (Map.Entry<String, Double> entry : neighbors.entrySet()) {
                    String nextNode = entry.getKey();
                    double nextWeight = entry.getValue();

                    if (!visited.contains(nextNode)) {
                        visited.add(nextNode);
                        queue.add(new Edge(nextNode, current.weight + nextWeight));
                    }
                }
            }
        }

        return -1.0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Evaluate Division Debug ====");
        System.out.print("Enter number of equations n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        String[][] equations = new String[n][2];
        double[] values = new double[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter variable 1 for equation " + (i + 1) + ": ");
            equations[i][0] = sc.nextLine().trim();
            System.out.print("Enter variable 2 for equation " + (i + 1) + ": ");
            equations[i][1] = sc.nextLine().trim();
            System.out.print("Enter value for equation " + (i + 1) + ": ");
            values[i] = Double.parseDouble(sc.nextLine().trim());
        }

        System.out.print("Enter number of queries q: ");
        int q = Integer.parseInt(sc.nextLine().trim());

        String[][] queries = new String[q][2];
        for (int i = 0; i < q; i = i + 1) {
            System.out.print("Enter variable 1 for query " + (i + 1) + ": ");
            queries[i][0] = sc.nextLine().trim();
            System.out.print("Enter variable 2 for query " + (i + 1) + ": ");
            queries[i][1] = sc.nextLine().trim();
        }

        double[] results = solve(equations, values, queries);
        System.out.println("Results: " + Arrays.toString(results));
    }
}
