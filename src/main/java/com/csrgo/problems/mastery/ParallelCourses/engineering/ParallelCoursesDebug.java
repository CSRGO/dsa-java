// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ParallelCourses.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/parallel-courses/
public class ParallelCoursesDebug {

    // TODO: debug this method to fix it
    public static int solve(int n, int[][] relations) {
        if (n <= 0) {
            return 0;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i = i + 1) {
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[n + 1];
        if (relations != null) {
            for (int i = 0; i < relations.length; i = i + 1) {
                int prev = relations[i][0];
                int next = relations[i][1];
                if (prev <= n && next <= n) {
                    adj.get(prev).add(next);
                    inDegree[next] = inDegree[next] + 1;
                }
            }
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i = i + 1) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int semesters = 0;
        int takenCount = 0;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            semesters = semesters + 1;
            takenCount = takenCount + 1;

            List<Integer> neighbors = adj.get(u);
            for (int j = 0; j < neighbors.size(); j = j + 1) {
                int v = neighbors.get(j);
                inDegree[v] = inDegree[v] - 1;
                if (inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }

        if (takenCount > n) {
            return semesters;
        }

        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of courses (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of relations: ");
        int m = sc.nextInt();

        int[][] relations = new int[m][2];
        System.out.println("Enter relations (prev next) line by line:");
        for (int i = 0; i < m; i = i + 1) {
            relations[i][0] = sc.nextInt();
            relations[i][1] = sc.nextInt();
        }

        int result = solve(n, relations);
        System.out.println("Minimum Semesters (Debug): " + result);
        sc.close();
    }
}
