// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ParallelCourses.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/parallel-courses/
public class ParallelCourses {

    public static int solve(int n, int[][] relations) {
        // TODO: write your logic here
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
        System.out.println("Minimum Semesters: " + result);
        sc.close();
    }
}
