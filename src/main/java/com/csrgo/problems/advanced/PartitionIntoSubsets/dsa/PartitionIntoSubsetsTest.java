// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PartitionIntoSubsets.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/partition-into-subsets
public class PartitionIntoSubsetsTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        PartitionIntoSubsets solver = new PartitionIntoSubsets();

        runner.addTestCase(new TestCase<>(
            "Standard Example 1",
            () -> solver.solve(4, 3),
            6L
        ));

        runner.addTestCase(new TestCase<>(
            "Standard Example 2",
            () -> solver.solve(3, 2),
            3L
        ));

        runner.addTestCase(new TestCase<>(
            "Zero Elements and Subsets",
            () -> solver.solve(0, 0),
            0L
        ));

        runner.addTestCase(new TestCase<>(
            "Single Subset All Elements",
            () -> solver.solve(4, 1),
            1L
        ));

        runner.addTestCase(new TestCase<>(
            "Subsets Equals Elements",
            () -> solver.solve(4, 4),
            1L
        ));

        runner.addTestCase(new TestCase<>(
            "Four Elements Two Subsets",
            () -> solver.solve(4, 2),
            7L
        ));

        runner.addTestCase(new TestCase<>(
            "More Subsets Than Elements",
            () -> solver.solve(2, 3),
            0L
        ));

        runner.addTestCase(new TestCase<>(
            "Five Elements Three Subsets",
            () -> solver.solve(5, 3),
            25L
        ));

        runner.addTestCase(new TestCase<>(
            "Five Elements Two Subsets",
            () -> solver.solve(5, 2),
            15L
        ));

        runner.addTestCase(new TestCase<>(
            "Six Elements Three Subsets",
            () -> solver.solve(6, 3),
            90L
        ));

        runner.runTests("PartitionIntoSubsetsTest", true);
    }
}
