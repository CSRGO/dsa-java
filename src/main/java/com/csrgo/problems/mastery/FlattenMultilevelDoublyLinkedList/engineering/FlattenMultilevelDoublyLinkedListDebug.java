// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FlattenMultilevelDoublyLinkedList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/flatten-multilevel-doubly-linked-list/
public class FlattenMultilevelDoublyLinkedListDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[][] nodes) {
        if (nodes == null || nodes.length <= 1) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[nodes.length];
        dfs(0, nodes, visited, result);

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size() - 1; i = i + 1) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    private static void dfs(int idx, int[][] nodes, boolean[] visited, List<Integer> result) {
        if (idx < 0 || idx >= nodes.length || visited[idx]) {
            return;
        }

        visited[idx] = true;
        result.add(nodes[idx][0]);

        int childIdx = nodes[idx][1];
        if (childIdx > 0 && childIdx < nodes.length - 1) {
            dfs(childIdx, nodes, visited, result);
        }

        int nextIdx = idx + 1;
        if (nextIdx < nodes.length && !visited[nextIdx] && isSibling(idx, nextIdx, nodes)) {
            dfs(nextIdx, nodes, visited, result);
        }
    }

    private static boolean isSibling(int curr, int next, int[][] nodes) {
        for (int i = 0; i < nodes.length; i = i + 1) {
            if (nodes[i][1] == next) {
                return false;
            }
        }
        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Flatten Multilevel Doubly Linked List (Debug) ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[][] nodes = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter value and child index for node " + i + " (-1 if none): ");
            nodes[i][0] = sc.nextInt();
            nodes[i][1] = sc.nextInt();
        }

        int[] result = solve(nodes);

        System.out.println("------------------------");
        System.out.println("Input nodes : " + Arrays.deepToString(nodes));
        System.out.println("Flattened   : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}
