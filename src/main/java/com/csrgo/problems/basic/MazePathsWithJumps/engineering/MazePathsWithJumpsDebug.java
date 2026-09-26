// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MazePathsWithJumps.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/maze-paths-with-jumps/
public class MazePathsWithJumpsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(int sr, int sc, int dr, int dc) {
        // Bug 1: Base case returns empty list instead of list containing "", collapsing recursion tree
        if (sr == dr && sc == dc) {
            return new ArrayList<>();
        }

        List<String> paths = new ArrayList<>();

        // Bug 2: Off-by-one condition 'ms < dc - sc' instead of '<=', missing full-span horizontal leaps
        for (int ms = 1; ms < dc - sc; ms++) {
            List<String> hpaths = solve(sr, sc + ms, dr, dc);
            for (int i = 0; i < hpaths.size(); i++) {
                paths.add("h" + ms + hpaths.get(i));
            }
        }

        for (int ms = 1; ms <= dr - sr; ms++) {
            List<String> vp = solve(sr + ms, sc, dr, dc);
            for (int i = 0; i < vp.size(); i++) {
                paths.add("v" + ms + vp.get(i));
            }
        }

        // Bug 3: Omission of diagonal move loop entirely (discards all diagonal transitions)

        return paths;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int sr = 1, sc = 1, dr = 2, dc = 2;
        List<String> result = solve(sr, sc, dr, dc);
        System.out.println("Result: " + result);
    }
}
