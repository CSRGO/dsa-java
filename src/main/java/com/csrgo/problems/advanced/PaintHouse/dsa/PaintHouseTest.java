// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PaintHouse.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

import java.util.Arrays;

// Problem Link: https://csrgo.com/problems/paint-house
public class PaintHouseTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        PaintHouse solver = new PaintHouse();

        runner.addTestCase(new TestCase<>(
            "Standard Example 1",
            () -> solver.solve(new int[][]{{17, 2, 17}, {16, 16, 5}, {14, 3, 19}}),
            10
        ));

        runner.addTestCase(new TestCase<>(
            "Single House",
            () -> solver.solve(new int[][]{{7, 6, 2}}),
            2
        ));

        runner.addTestCase(new TestCase<>(
            "Two Houses Same Costs",
            () -> solver.solve(new int[][]{{5, 5, 5}, {5, 5, 5}}),
            10
        ));

        runner.addTestCase(new TestCase<>(
            "Two Houses Distinct Costs",
            () -> solver.solve(new int[][]{{1, 2, 3}, {1, 2, 3}}),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Alternating Minimum",
            () -> solver.solve(new int[][]{{1, 10, 10}, {10, 1, 10}, {1, 10, 10}}),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Strictly Decreasing Costs",
            () -> solver.solve(new int[][]{{10, 9, 8}, {7, 6, 5}, {4, 3, 2}}),
            15
        ));

        runner.addTestCase(new TestCase<>(
            "Zero Cost House",
            () -> solver.solve(new int[][]{{0, 0, 0}, {0, 0, 0}}),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Four Houses Monotonic",
            () -> solver.solve(new int[][]{{1, 5, 3}, {2, 9, 4}, {5, 1, 2}, {3, 7, 4}}),
            8
        ));

        runner.addTestCase(new TestCase<>(
            "Large Values",
            () -> solver.solve(new int[][]{{100, 200, 300}, {300, 100, 200}, {200, 300, 100}}),
            300
        ));

        runner.addTestCase(new TestCase<>(
            "Empty Input Array",
            () -> solver.solve(new int[][]{}),
            0
        ));

        runner.runTests("PaintHouseTest", true);
    }
}
