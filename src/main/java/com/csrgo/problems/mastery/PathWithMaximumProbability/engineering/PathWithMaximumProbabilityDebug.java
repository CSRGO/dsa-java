// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PathWithMaximumProbability.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/path-with-maximum-probability/
public class PathWithMaximumProbabilityDebug {

    static class Edge {
        int to;
        double prob;

        Edge(int to, double prob) {
            this.to = to;
            this.prob = prob;
        }
    }

    static class State implements Comparable<State> {
        int node;
        double prob;

        State(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }

        @Override
        public int compareTo(State other) {
            return Double.compare(this.prob, other.prob);
        }
    }

    // TODO: debug this method to fix it
    public static double solve(int n, int[][] edges, double[] succProb, int startNode, int endNode) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i = i + 1) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i = i + 1) {
            int u = edges[i][0];
            int v = edges[i][1];
            double p = succProb[i];
            graph.get(u).add(new Edge(v, p));
        }

        double[] maxProb = new double[n];
        maxProb[startNode] = 1.0;

        PriorityQueue<State> pq = new PriorityQueue<>();
        pq.offer(new State(startNode, 1.0));

        while (!pq.isEmpty()) {
            State current = pq.poll();
            int u = current.node;
            double p = current.prob;

            if (u == endNode) {
                return p;
            }

            if (p < maxProb[u]) {
                continue;
            }

            List<Edge> neighbors = graph.get(u);
            for (int i = 0; i < neighbors.size(); i = i + 1) {
                Edge edge = neighbors.get(i);
                int next = edge.to;
                double nextProb = p + edge.prob;

                if (nextProb > maxProb[next]) {
                    maxProb[next] = nextProb;
                    pq.offer(new State(next, nextProb));
                }
            }
        }

        return 0.0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Path with Maximum Probability Debug ====");
        System.out.print("Enter number of nodes n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter number of edges m: ");
        int m = Integer.parseInt(sc.nextLine().trim());

        int[][] edges = new int[m][2];
        double[] succProb = new double[m];

        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter source node for edge " + (i + 1) + ": ");
            edges[i][0] = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter destination node for edge " + (i + 1) + ": ");
            edges[i][1] = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter probability for edge " + (i + 1) + ": ");
            succProb[i] = Double.parseDouble(sc.nextLine().trim());
        }

        System.out.print("Enter start node: ");
        int startNode = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter end node: ");
        int endNode = Integer.parseInt(sc.nextLine().trim());

        double result = solve(n, edges, succProb, startNode, endNode);
        System.out.println("Maximum Probability: " + result);
    }
}
