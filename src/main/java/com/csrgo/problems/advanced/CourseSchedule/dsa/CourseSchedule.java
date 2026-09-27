// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CourseSchedule.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/course-schedule/
public class CourseSchedule {

    public static boolean solve(int numCourses, int[][] prerequisites) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Course Schedule ====");
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
