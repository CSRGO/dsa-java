// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumHeightTrees.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinimumHeightTreesDebugTest {

    static class Input {
        final int n;
        final int[][] edges;

        Input(int n, int[][] edges) {
            this.n = n;
            this.edges = edges;
        }

        @Override
        public String toString() {
            return "n=" + n + ", edges=" + Arrays.deepToString(edges);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Star Tree Single Center",
                new Input(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}),
                new int[]{1}
            ),
            new TestCase<>(
                "Six Nodes Two Centroids",
                new Input(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}),
                new int[]{3, 4}
            ),
            new TestCase<>(
                "Single Node Isolated",
                new Input(1, new int[][]{}),
                new int[]{0}
            ),
            new TestCase<>(
                "Two Nodes Both Centroids",
                new Input(2, new int[][]{{0, 1}}),
                new int[]{0, 1}
            ),
            new TestCase<>(
                "Three Nodes Linear Path Center Centroid",
                new Input(3, new int[][]{{0, 1}, {1, 2}}),
                new int[]{1}
            ),
            new TestCase<>(
                "Four Nodes Linear Path Two Centroids",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Five Nodes Linear Path Single Center",
                new Input(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}),
                new int[]{2}
            ),
            new TestCase<>(
                "Star Tree Center Zero",
                new Input(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}}),
                new int[]{0}
            ),
            new TestCase<>(
                "Seven Nodes Symmetric Two Star Hubs",
                new Input(7, new int[][]{{0, 1}, {0, 2}, {0, 3}, {3, 4}, {4, 5}, {4, 6}}),
                new int[]{3}
            ),
            new TestCase<>(
                "Six Nodes Multi Branch Single Centroid",
                new Input(6, new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 4}, {2, 5}}),
                new int[]{0}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Minimum Height Trees (Debug)",
            testCases,
            input -> MinimumHeightTreesDebug.solve(input.n, deepCopy(input.edges)),
            false
        );
    }

    private static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i = i + 1) {
            copy[i] = original[i].clone();
        }
        return copy;
    }
}
