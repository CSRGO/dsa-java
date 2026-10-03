// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UniquePathsII.engineering;

import java.util.*;
import com.csrgo.util.*;

public class UniquePathsIIDebugTest {

    static class Input {
        final int[][] obstacleGrid;

        Input(int[][] obstacleGrid) {
            this.obstacleGrid = obstacleGrid;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(obstacleGrid);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Three By Three Center Obstacle",
                new Input(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}),
                2
            ),
            new TestCase<>(
                "Two By Two Single Obstacle",
                new Input(new int[][]{{0, 1}, {0, 0}}),
                1
            ),
            new TestCase<>(
                "Start Point Blocked By Obstacle",
                new Input(new int[][]{{1, 0}, {0, 0}}),
                0
            ),
            new TestCase<>(
                "Destination Point Blocked By Obstacle",
                new Input(new int[][]{{0, 0}, {0, 1}}),
                0
            ),
            new TestCase<>(
                "Single Open Cell Grid",
                new Input(new int[][]{{0}}),
                1
            ),
            new TestCase<>(
                "Single Obstacle Cell Grid",
                new Input(new int[][]{{1}}),
                0
            ),
            new TestCase<>(
                "Single Row With Middle Obstacle",
                new Input(new int[][]{{0, 1, 0}}),
                0
            ),
            new TestCase<>(
                "Single Column With Middle Obstacle",
                new Input(new int[][]{{0}, {1}, {0}}),
                0
            ),
            new TestCase<>(
                "Wall Blocking Lower Route",
                new Input(new int[][]{{0, 0, 0}, {1, 1, 0}, {0, 0, 0}}),
                1
            ),
            new TestCase<>(
                "Four By Four Fully Open Grid",
                new Input(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}),
                20
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Unique Paths II Debug",
            testCases,
            input -> UniquePathsIIDebug.solve(deepCopy(input.obstacleGrid)),
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
