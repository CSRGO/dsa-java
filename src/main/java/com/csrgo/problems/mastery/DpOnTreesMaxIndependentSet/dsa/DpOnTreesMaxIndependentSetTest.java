// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DpOnTreesMaxIndependentSet.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DpOnTreesMaxIndependentSetTest {

    static class Input {
        final int n;
        final int[][] edges;
        final int[] weights;

        Input(int n, int[][] edges, int[] weights) {
            this.n = n;
            this.edges = edges;
            this.weights = weights;
        }

        @Override
        public String toString() {
            return "n=" + n
                + ", edges=" + Arrays.deepToString(edges)
                + ", weights=" + Arrays.toString(weights);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Star Graph Root Dominant",
                new Input(4, new int[][]{{0, 1}, {0, 2}, {0, 3}}, new int[]{10, 2, 3, 4}),
                10
            ),
            new TestCase<>(
                "Star Graph Leaves Dominant",
                new Input(4, new int[][]{{0, 1}, {0, 2}, {0, 3}}, new int[]{1, 5, 5, 5}),
                15
            ),
            new TestCase<>(
                "Single Node Tree",
                new Input(1, new int[][]{}, new int[]{20}),
                20
            ),
            new TestCase<>(
                "Two Node Single Edge",
                new Input(2, new int[][]{{0, 1}}, new int[]{15, 25}),
                25
            ),
            new TestCase<>(
                "Three Node Line Ends Dominant",
                new Input(3, new int[][]{{0, 1}, {1, 2}}, new int[]{10, 1, 10}),
                20
            ),
            new TestCase<>(
                "Three Node Line Center Dominant",
                new Input(3, new int[][]{{0, 1}, {1, 2}}, new int[]{1, 100, 1}),
                100
            ),
            new TestCase<>(
                "Five Node Line Alternating Optimal",
                new Input(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}, new int[]{2, 7, 9, 3, 1}),
                12
            ),
            new TestCase<>(
                "Binary Tree Depth Two Leaves Dominant",
                new Input(5, new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}}, new int[]{10, 20, 30, 40, 50}),
                120
            ),
            new TestCase<>(
                "Six Node Balanced Tree",
                new Input(6, new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}}, new int[]{5, 10, 15, 20, 25, 30}),
                80
            ),
            new TestCase<>(
                "Four Node Equal Weights Line",
                new Input(4, new int[][]{{0, 1}, {1, 2}, {2, 3}}, new int[]{4, 4, 4, 4}),
                8
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "DP on Trees (Max Independent Set)",
            testCases,
            input -> DpOnTreesMaxIndependentSet.solve(input.n, deepCopy(input.edges), input.weights.clone()),
            true
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
