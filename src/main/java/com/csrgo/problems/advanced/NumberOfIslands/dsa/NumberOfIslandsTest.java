// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NumberOfIslands.dsa;

import java.util.*;
import com.csrgo.util.*;

public class NumberOfIslandsTest {

    public static void main(String[] args) {
        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>(
                "Single Large Connected Island",
                new int[][]{
                    {1, 1, 1, 1, 0},
                    {1, 1, 0, 1, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0}
                },
                1
            ),
            new TestCase<>(
                "Three Distinct Disconnected Islands",
                new int[][]{
                    {1, 1, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 0, 1, 1}
                },
                3
            ),
            new TestCase<>(
                "All Water Grid Matrix",
                new int[][]{
                    {0, 0, 0},
                    {0, 0, 0}
                },
                0
            ),
            new TestCase<>(
                "All Land Grid Matrix",
                new int[][]{
                    {1, 1},
                    {1, 1}
                },
                1
            ),
            new TestCase<>(
                "Checkerboard Diagonal Separation",
                new int[][]{
                    {1, 0, 1},
                    {0, 1, 0},
                    {1, 0, 1}
                },
                5
            ),
            new TestCase<>(
                "Single Land Cell Only",
                new int[][]{{1}},
                1
            ),
            new TestCase<>(
                "Single Water Cell Only",
                new int[][]{{0}},
                0
            ),
            new TestCase<>(
                "Empty Matrix Boundary",
                new int[][]{},
                0
            ),
            new TestCase<>(
                "Single Row Striped Islands",
                new int[][]{{1, 0, 1, 0, 1}},
                3
            ),
            new TestCase<>(
                "Single Column Striped Islands",
                new int[][]{{1}, {0}, {1}, {0}, {1}},
                3
            )
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Number of Islands",
            testCases,
            input -> NumberOfIslands.solve(input),
            true
        );
    }
}
