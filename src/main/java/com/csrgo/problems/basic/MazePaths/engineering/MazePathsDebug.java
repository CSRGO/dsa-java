// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MazePaths.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/maze-paths/
public class MazePathsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(int sr, int sc, int dr, int dc) {
        // Bug 1: Base case returns empty list instead of list with empty string "", pruning all valid path trees
        if (sr == dr && sc == dc) {
            return new ArrayList<>();
        }
        // Bug 2: Uses '>=' instead of '>', falsely pruning valid traversal at destination boundary
        if (sr >= dr || sc >= dc) {
            return new ArrayList<>();
        }

        // Bug 3: Swaps coordinate parameters: increments row for horizontal paths and column for vertical paths
        List<String> hpaths = solve(sr + 1, sc, dr, dc);
        List<String> vpaths = solve(sr, sc + 1, dr, dc);

        List<String> paths = new ArrayList<>();

        for (int i = 0; i < hpaths.size(); i++) {
            paths.add("h" + hpaths.get(i));
        }
        for (int i = 0; i < vpaths.size(); i++) {
            paths.add("v" + vpaths.get(i));
        }

        return paths;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int sr = 1, sc = 1, dr = 2, dc = 2;
        List<String> result = solve(sr, sc, dr, dc);
        System.out.println("Result: " + result);
    }
}
