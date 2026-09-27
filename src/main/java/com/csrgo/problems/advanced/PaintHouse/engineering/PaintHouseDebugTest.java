// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PaintHouse.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/paint-house
public class PaintHouseDebugTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        PaintHouseDebug solver = new PaintHouseDebug();

        runner.addTestCase(new TestCase<>(
            "Standard Three Houses",
            () -> solver.solve(new int[][]{{17, 2, 17}, {16, 16, 5}, {14, 3, 19}}),
            10
        ));

        runner.addTestCase(new TestCase<>(
            "Single House Costs",
            () -> solver.solve(new int[][]{{7, 6, 2}}),
            2
        ));

        runner.addTestCase(new TestCase<>(
            "Identical Costs",
            () -> solver.solve(new int[][]{{5, 5, 5}, {5, 5, 5}}),
            10
        ));

        runner.addTestCase(new TestCase<>(
            "Two Houses Distinct",
            () -> solver.solve(new int[][]{{1, 2, 3}, {1, 2, 3}}),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Alternating Minimum Values",
            () -> solver.solve(new int[][]{{1, 10, 10}, {10, 1, 10}, {1, 10, 10}}),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Descending Values",
            () -> solver.solve(new int[][]{{10, 9, 8}, {7, 6, 5}, {4, 3, 2}}),
            15
        ));

        runner.addTestCase(new TestCase<>(
            "All Zero Cost Configuration",
            () -> solver.solve(new int[][]{{0, 0, 0}, {0, 0, 0}}),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Multiple Houses Optimal Path",
            () -> solver.solve(new int[][]{{1, 5, 3}, {2, 9, 4}, {5, 1, 2}, {3, 7, 4}}),
            8
        ));

        runner.addTestCase(new TestCase<>(
            "Elevated Cost Multipliers",
            () -> solver.solve(new int[][]{{100, 200, 300}, {300, 100, 200}, {200, 300, 100}}),
            300
        ));

        runner.addTestCase(new TestCase<>(
            "Empty Input Representation",
            () -> solver.solve(new int[][]{}),
            0
        ));

        runner.runTests("PaintHouseDebugTest", false);
    }
}
