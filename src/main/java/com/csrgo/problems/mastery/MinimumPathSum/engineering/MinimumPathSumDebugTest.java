// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumPathSum.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinimumPathSumDebugTest {

    static class Input {
        final int[][] grid;

        Input(int[][] grid) {
            this.grid = grid;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(grid);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Three By Three Standard Grid",
                new Input(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}),
                7
            ),
            new TestCase<>(
                "Two By Three Grid",
                new Input(new int[][]{{1, 2, 3}, {4, 5, 6}}),
                12
            ),
            new TestCase<>(
                "Single Cell Grid",
                new Input(new int[][]{{5}}),
                5
            ),
            new TestCase<>(
                "Single Row Three Columns",
                new Input(new int[][]{{1, 2, 3}}),
                6
            ),
            new TestCase<>(
                "Three Rows Single Column",
                new Input(new int[][]{{1}, {2}, {3}}),
                6
            ),
            new TestCase<>(
                "Two By Two Grid Symmetrical Paths",
                new Input(new int[][]{{1, 2}, {1, 1}}),
                3
            ),
            new TestCase<>(
                "Two By Two Grid High Corner Element",
                new Input(new int[][]{{1, 10}, {1, 1}}),
                3
            ),
            new TestCase<>(
                "Three By Three All Zero Costs",
                new Input(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}),
                0
            ),
            new TestCase<>(
                "Four By Four Diagonal Narrow Path",
                new Input(new int[][]{{1, 9, 9, 9}, {1, 1, 9, 9}, {9, 1, 1, 9}, {9, 9, 1, 1}}),
                7
            ),
            new TestCase<>(
                "Three By Three Uniform Cost Grid",
                new Input(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}),
                5
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Minimum Path Sum Debug",
            testCases,
            input -> MinimumPathSumDebug.solve(deepCopy(input.grid)),
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
