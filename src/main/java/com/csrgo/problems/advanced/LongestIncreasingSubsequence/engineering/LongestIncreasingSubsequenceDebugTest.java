// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.LongestIncreasingSubsequence.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/longest-increasing-subsequence
public class LongestIncreasingSubsequenceDebugTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        LongestIncreasingSubsequenceDebug solver = new LongestIncreasingSubsequenceDebug();

        runner.addTestCase(new TestCase<>(
            "Unordered Vector Sample",
            () -> solver.solve(new int[]{10, 9, 2, 5, 3, 7, 101, 18}),
            4
        ));

        runner.addTestCase(new TestCase<>(
            "Duplicate Clustered Sequence",
            () -> solver.solve(new int[]{0, 1, 0, 3, 2, 3}),
            4
        ));

        runner.addTestCase(new TestCase<>(
            "Uniform Constant Elements",
            () -> solver.solve(new int[]{7, 7, 7, 7, 7, 7, 7}),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Strictly Ascending Chain",
            () -> solver.solve(new int[]{1, 2, 3, 4, 5}),
            5
        ));

        runner.addTestCase(new TestCase<>(
            "Monotonically Descending Chain",
            () -> solver.solve(new int[]{5, 4, 3, 2, 1}),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Empty Input Vector",
            () -> solver.solve(new int[]{}),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Isolated Single Value",
            () -> solver.solve(new int[]{42}),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Signed Polar Integers",
            () -> solver.solve(new int[]{-2, -1, -3, 0, 2, 1, 3}),
            5
        ));

        runner.addTestCase(new TestCase<>(
            "Dispersed Metric Fluctuations",
            () -> solver.solve(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}),
            6
        ));

        runner.addTestCase(new TestCase<>(
            "Truncated Oscillating Series",
            () -> solver.solve(new int[]{3, 10, 2, 1, 20}),
            3
        ));

        runner.runTests("LongestIncreasingSubsequenceDebugTest", false);
    }
}
