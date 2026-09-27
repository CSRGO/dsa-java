// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.LISBinarySearch.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/lis-binary-search
public class LISBinarySearchTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        LISBinarySearch solver = new LISBinarySearch();

        runner.addTestCase(new TestCase<>(
            "Standard Example 1",
            () -> solver.solve(new int[]{10, 9, 2, 5, 3, 7, 101, 18}),
            4
        ));

        runner.addTestCase(new TestCase<>(
            "All Identical Elements Example 2",
            () -> solver.solve(new int[]{7, 7, 7, 7, 7, 7, 7}),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Duplicate Clustered Sequence",
            () -> solver.solve(new int[]{0, 1, 0, 3, 2, 3}),
            4
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
            "Complex Plateau Sequence",
            () -> solver.solve(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}),
            6
        ));

        runner.runTests("LISBinarySearchTest", true);
    }
}
