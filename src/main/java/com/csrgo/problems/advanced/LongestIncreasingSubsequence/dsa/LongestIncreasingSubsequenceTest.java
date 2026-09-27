// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.LongestIncreasingSubsequence.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/longest-increasing-subsequence
public class LongestIncreasingSubsequenceTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        LongestIncreasingSubsequence solver = new LongestIncreasingSubsequence();

        runner.addTestCase(new TestCase<>(
            "Standard Example 1",
            () -> solver.solve(new int[]{10, 9, 2, 5, 3, 7, 101, 18}),
            4
        ));

        runner.addTestCase(new TestCase<>(
            "Standard Example 2",
            () -> solver.solve(new int[]{0, 1, 0, 3, 2, 3}),
            4
        ));

        runner.addTestCase(new TestCase<>(
            "All Identical Elements",
            () -> solver.solve(new int[]{7, 7, 7, 7, 7, 7, 7}),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Strictly Increasing Sequence",
            () -> solver.solve(new int[]{1, 2, 3, 4, 5}),
            5
        ));

        runner.addTestCase(new TestCase<>(
            "Strictly Decreasing Sequence",
            () -> solver.solve(new int[]{5, 4, 3, 2, 1}),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Empty Array",
            () -> solver.solve(new int[]{}),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Single Element Array",
            () -> solver.solve(new int[]{42}),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Negative And Positive Mixture",
            () -> solver.solve(new int[]{-2, -1, -3, 0, 2, 1, 3}),
            5
        ));

        runner.addTestCase(new TestCase<>(
            "Interleaved Sequence",
            () -> solver.solve(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}),
            6
        ));

        runner.addTestCase(new TestCase<>(
            "Small Irregular Sequence",
            () -> solver.solve(new int[]{3, 10, 2, 1, 20}),
            3
        ));

        runner.runTests("LongestIncreasingSubsequenceTest", true);
    }
}
