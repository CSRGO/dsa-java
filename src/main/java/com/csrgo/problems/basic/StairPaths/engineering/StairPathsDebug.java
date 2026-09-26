// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StairPaths.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/stair-paths/
public class StairPathsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(int n) {
        // Bug 1: Base case n == 0 returns empty list instead of list containing empty string "", terminating all paths
        if (n == 0) {
            return new ArrayList<>();
        }
        if (n < 0) {
            return new ArrayList<>();
        }

        List<String> paths1 = solve(n - 1);
        List<String> paths2 = solve(n - 2);
        // Bug 2: Missing recursive exploration for 3-step jumps (paths3 = solve(n - 3))

        List<String> paths = new ArrayList<>();

        for (int i = 0; i < paths1.size(); i++) {
            // Bug 3: Appends jump step to end of path string rather than prepending to beginning
            paths.add(paths1.get(i) + "1");
        }
        for (int i = 0; i < paths2.size(); i++) {
            paths.add(paths2.get(i) + "2");
        }

        return paths;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int n = 3;
        List<String> result = solve(n);
        System.out.println("Result: " + result);
    }
}
