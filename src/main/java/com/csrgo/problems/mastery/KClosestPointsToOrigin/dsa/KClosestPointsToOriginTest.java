// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.KClosestPointsToOrigin.dsa;

import java.util.*;
import com.csrgo.util.*;

public class KClosestPointsToOriginTest {

    static class Input {
        final int[][] points;
        final int k;

        Input(int[][] points, int k) {
            this.points = points;
            this.k = k;
        }

        @Override
        public String toString() {
            return "points=" + Arrays.deepToString(points) + ", k=" + k;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[][]>> testCases = List.of(
            new TestCase<>(
                "Standard Two Points K One",
                new Input(new int[][]{{1, 3}, {-2, 2}}, 1),
                new int[][]{{-2, 2}}
            ),
            new TestCase<>(
                "Three Points K Two",
                new Input(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2),
                new int[][]{{-2, 4}, {3, 3}}
            ),
            new TestCase<>(
                "Two Points Equal Distance K Two",
                new Input(new int[][]{{0, 1}, {1, 0}}, 2),
                new int[][]{{0, 1}, {1, 0}}
            ),
            new TestCase<>(
                "Single Point K One",
                new Input(new int[][]{{2, 2}}, 1),
                new int[][]{{2, 2}}
            ),
            new TestCase<>(
                "Collinear Points K One",
                new Input(new int[][]{{1, 1}, {2, 2}, {3, 3}}, 1),
                new int[][]{{1, 1}}
            ),
            new TestCase<>(
                "Negative Coordinates K Two",
                new Input(new int[][]{{-1, -1}, {-2, -2}, {-3, -3}}, 2),
                new int[][]{{-2, -2}, {-1, -1}}
            ),
            new TestCase<>(
                "Strictly Distinct Distance Four Points",
                new Input(new int[][]{{-1, 0}, {0, 1}, {5, 5}, {6, 6}}, 2),
                new int[][]{{-1, 0}, {0, 1}}
            ),
            new TestCase<>(
                "Single Close Rest Far",
                new Input(new int[][]{{10, 0}, {0, 10}, {1, 1}}, 1),
                new int[][]{{1, 1}}
            ),
            new TestCase<>(
                "Four Points Mixed Signs K Three",
                new Input(new int[][]{{6, 10}, {-3, 3}, {-2, 5}, {0, 2}}, 3),
                new int[][]{{-3, 3}, {-2, 5}, {0, 2}}
            ),
            new TestCase<>(
                "Diagonal Positive Points K Two",
                new Input(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}}, 2),
                new int[][]{{1, 1}, {2, 2}}
            )
        );

        TestRunner<Input, int[][]> runner = new TestRunner<>();

        runner.runTests(
            "K Closest Points to Origin",
            testCases,
            input -> KClosestPointsToOrigin.solve(deepCopy(input.points), input.k),
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
