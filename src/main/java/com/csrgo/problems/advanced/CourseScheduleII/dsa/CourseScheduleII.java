// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CourseScheduleII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/course-schedule-ii/
public class CourseScheduleII {

    public static int[] solve(int numCourses, int[][] prerequisites) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Course Schedule II ====");
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
