// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CourseScheduleII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/course-schedule-ii/
public class CourseScheduleIIDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[numCourses];
        for (int[] p : prerequisites) {
            int course = p[0];
            int prereq = p[1];
            graph.get(course).add(prereq);
            inDegree[course]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                pq.add(i);
            }
        }

        int[] result = new int[numCourses];
        int idx = 0;

        while (!pq.isEmpty()) {
            int curr = pq.poll();
            result[idx++] = curr;

            for (int neighbor : graph.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] < 0) {
                    pq.add(neighbor);
                }
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Course Schedule II (DEBUG) ====");
        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();
        System.out.print("Enter number of prerequisite pairs: ");
        int p = scanner.nextInt();
        int[][] prerequisites = new int[p][2];
        System.out.println("Enter " + p + " pairs (course prerequisite):");
        for (int i = 0; i < p; i++) {
            System.out.print("Pair " + (i + 1) + " (a b): ");
            prerequisites[i][0] = scanner.nextInt();
            prerequisites[i][1] = scanner.nextInt();
        }

        int[] order = solve(numCourses, prerequisites);

        System.out.println("------------------------");
        System.out.println("Course Ordering: " + Arrays.toString(order));
        System.out.println("========================");

        scanner.close();
    }
}
