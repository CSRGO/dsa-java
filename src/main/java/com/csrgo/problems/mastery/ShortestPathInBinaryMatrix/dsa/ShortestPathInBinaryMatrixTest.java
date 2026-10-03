// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ShortestPathInBinaryMatrix.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ShortestPathInBinaryMatrixTest {

    static class Input {
        int[][] grid;

        Input(int[][] grid) {
            this.grid = grid;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(grid);
        }
    }

    private static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i = i + 1) {
            copy[i] = original[i].clone();
        }
        return copy;
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Two By Two Diagonal Open Path",
                new Input(new int[][]{{0, 1}, {1, 0}}),
                2
            ),
            new TestCase<>(
                "Three By Three Path Bypassing Center Wall",
                new Input(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}),
                4
            ),
            new TestCase<>(
                "Blocked Top Left Start Cell",
                new Input(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}}),
                -1
            ),
            new TestCase<>(
                "Single Open Cell Grid",
                new Input(new int[][]{{0}}),
                1
            ),
            new TestCase<>(
                "Single Blocked Cell Grid",
                new Input(new int[][]{{1}}),
                -1
            ),
            new TestCase<>(
                "Center Obstacle Circumvented Diagonally",
                new Input(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}),
                4
            ),
            new TestCase<>(
                "Four By Four Grid Open Path",
                new Input(new int[][]{{0, 0, 0, 0}, {1, 0, 0, 1}, {0, 1, 0, 0}, {0, 0, 0, 0}}),
                4
            ),
            new TestCase<>(
                "Completely Blocked Diagonal And Subdiagonal",
                new Input(new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 1, 0}}),
                -1
            ),
            new TestCase<>(
                "Full Horizontal Wall Bisecting Grid",
                new Input(new int[][]{{0, 0, 0}, {1, 1, 1}, {0, 0, 0}}),
                -1
            ),
            new TestCase<>(
                "Four By Four Winding Clear Path",
                new Input(new int[][]{{0, 1, 0, 0}, {0, 1, 0, 1}, {0, 0, 0, 1}, {1, 1, 0, 0}}),
                5
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Shortest Path in Binary Matrix",
            testCases,
            input -> ShortestPathInBinaryMatrix.solve(deepCopy(input.grid)),
            true
        );
    }
}
