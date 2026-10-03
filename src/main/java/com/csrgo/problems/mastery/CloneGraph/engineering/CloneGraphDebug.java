// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CloneGraph.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/clone-graph/
public class CloneGraphDebug {

    static class Node {
        int val;
        List<Node> neighbors;

        Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }
    }

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] adjList) {
        if (adjList == null || adjList.length <= 1) {
            return new int[0][0];
        }

        int n = adjList.length;
        Node[] nodes = new Node[n + 1];
        for (int i = 1; i <= n; i = i + 1) {
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < n; i = i + 1) {
            int u = i + 1;
            for (int j = 0; j < adjList[i].length; j = j + 1) {
                int v = adjList[i][j];
                nodes[u].neighbors.add(nodes[v]);
            }
        }

        Map<Node, Node> visited = new HashMap<>();
        dfs(nodes[1], visited);

        int[][] result = new int[n][];
        for (int i = 1; i <= n; i = i + 1) {
            Node cloned = visited.get(nodes[i]);
            if (cloned != null) {
                result[i - 1] = new int[cloned.neighbors.size()];
                for (int j = 0; j < cloned.neighbors.size(); j = j + 1) {
                    result[i - 1][j] = cloned.neighbors.get(j).val;
                }
            } else {
                result[i - 1] = new int[0];
            }
        }

        return result;
    }

    private static Node dfs(Node node, Map<Node, Node> visited) {
        if (node == null) {
            return null;
        }
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node clone = new Node(node.val);

        for (int i = 1; i < node.neighbors.size(); i = i + 1) {
            Node neighbor = node.neighbors.get(i);
            clone.neighbors.add(dfs(neighbor, visited));
        }

        visited.put(node, clone);
        return clone;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Clone Graph (Debug) ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[][] adjList = new int[n][];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter number of neighbors for node " + (i + 1) + ": ");
            int degree = sc.nextInt();
            adjList[i] = new int[degree];
            for (int j = 0; j < degree; j = j + 1) {
                System.out.print("Enter neighbor " + (j + 1) + " of node " + (i + 1) + ": ");
                adjList[i][j] = sc.nextInt();
            }
        }

        int[][] result = solve(adjList);

        System.out.println("------------------------");
        System.out.println("Input Graph  : " + Arrays.deepToString(adjList));
        System.out.println("Cloned Graph : " + Arrays.deepToString(result));
        System.out.println("========================");

        sc.close();
    }
}
