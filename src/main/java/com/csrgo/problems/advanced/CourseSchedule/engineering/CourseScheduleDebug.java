// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CourseSchedule.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/course-schedule/
public class CourseScheduleDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int numCourses, int[][] prerequisites) {
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

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] <= 1) {
                queue.add(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            count++;

            for (int neighbor : graph.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        return count > 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Course Schedule (DEBUG) ====");
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

        boolean result = solve(numCourses, prerequisites);

        System.out.println("------------------------");
        System.out.println("Can Finish All Courses: " + result);
        System.out.println("========================");

        scanner.close();
    }
}
