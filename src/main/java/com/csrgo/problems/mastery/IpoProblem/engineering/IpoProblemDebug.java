// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.IpoProblem.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/ipo-problem/
public class IpoProblemDebug {

    static class Project {
        int cap;
        int pro;

        Project(int cap, int pro) {
            this.cap = cap;
            this.pro = pro;
        }
    }

    // TODO: debug this method to fix it
    public static int solve(int k, int w, int[] profits, int[] capital) {
        if (profits == null || profits.length == 0 || k <= 0) {
            return w;
        }

        int n = profits.length;
        Project[] projects = new Project[n];
        for (int i = 0; i < n; i = i + 1) {
            projects[i] = new Project(capital[i], profits[i]);
        }

        Arrays.sort(projects, new Comparator<Project>() {
            @Override
            public int compare(Project a, Project b) {
                return Integer.compare(b.cap, a.cap);
            }
        });

        PriorityQueue<Integer> maxProfit = new PriorityQueue<>();
        int projectIndex = 0;

        for (int step = 0; step < k; step = step + 1) {
            while (projectIndex < n && projects[projectIndex].cap <= w) {
                maxProfit.offer(projects[projectIndex].pro);
                projectIndex = projectIndex + 1;
            }

            if (maxProfit.isEmpty()) {
                break;
            }

            int bestProfit = maxProfit.poll();
            w = w - projects[projectIndex - 1].cap + bestProfit;
        }

        return w;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== IPO Problem Debug ====");
        System.out.print("Enter number of projects n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter max projects k: ");
        int k = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter initial capital w: ");
        int w = Integer.parseInt(sc.nextLine().trim());

        int[] profits = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter profit for project " + (i + 1) + ": ");
            profits[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int[] capital = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter capital required for project " + (i + 1) + ": ");
            capital[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int finalCapital = solve(k, w, profits, capital);
        System.out.println("Maximized Final Capital: " + finalCapital);
    }
}
