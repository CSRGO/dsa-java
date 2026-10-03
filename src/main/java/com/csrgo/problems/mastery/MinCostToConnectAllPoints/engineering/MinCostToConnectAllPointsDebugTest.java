// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinCostToConnectAllPoints.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinCostToConnectAllPointsDebugTest {

    static class Input {
        int[][] points;

        Input(int[][] points) {
            this.points = points;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(points);
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
                "Standard Five Points Cluster",
                new Input(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}),
                20
            ),
            new TestCase<>(
                "Three Points In Different Quadrants",
                new Input(new int[][]{{3, 12}, {-2, 5}, {-4, 1}}),
                18
            ),
            new TestCase<>(
                "Single Isolated Origin Point",
                new Input(new int[][]{{0, 0}}),
                0
            ),
            new TestCase<>(
                "Two Points Diagonal Unit Square",
                new Input(new int[][]{{0, 0}, {1, 1}}),
                2
            ),
            new TestCase<>(
                "Four Corners Of Unit Square",
                new Input(new int[][]{{0, 0}, {1, 1}, {1, 0}, {0, 1}}),
                3
            ),
            new TestCase<>(
                "Two Points With Large Coordinates",
                new Input(new int[][]{{-1000000, -1000000}, {1000000, 1000000}}),
                4000000
            ),
            new TestCase<>(
                "Four Collinear Points Along Y Axis",
                new Input(new int[][]{{0, 0}, {0, 2}, {0, 4}, {0, 6}}),
                6
            ),
            new TestCase<>(
                "Four Points Irregular Coordinates",
                new Input(new int[][]{{2, -3}, {-17, -8}, {13, 8}, {-17, -12}}),
                50
            ),
            new TestCase<>(
                "Five Equidistant Horizontal Points",
                new Input(new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}}),
                4
            ),
            new TestCase<>(
                "Symmetric Square Centered At Origin",
                new Input(new int[][]{{-14, -14}, {-14, 14}, {14, -14}, {14, 14}}),
                84
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Min Cost to Connect All Points (Debug)",
            testCases,
            input -> MinCostToConnectAllPointsDebug.solve(deepCopy(input.points)),
            false
        );
    }
}
