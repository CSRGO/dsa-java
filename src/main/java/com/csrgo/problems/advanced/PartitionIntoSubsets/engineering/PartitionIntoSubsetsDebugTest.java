// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PartitionIntoSubsets.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/partition-into-subsets
public class PartitionIntoSubsetsDebugTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        PartitionIntoSubsetsDebug solver = new PartitionIntoSubsetsDebug();

        runner.addTestCase(new TestCase<>(
            "Four Elements Three Partitions Sample",
            () -> solver.solve(4, 3),
            6L
        ));

        runner.addTestCase(new TestCase<>(
            "Three Elements Two Partitions Sample",
            () -> solver.solve(3, 2),
            3L
        ));

        runner.addTestCase(new TestCase<>(
            "Zero Population Ground Assessment",
            () -> solver.solve(0, 0),
            0L
        ));

        runner.addTestCase(new TestCase<>(
            "Monolithic Group Partition",
            () -> solver.solve(4, 1),
            1L
        ));

        runner.addTestCase(new TestCase<>(
            "Full Disintegration Subsets",
            () -> solver.solve(4, 4),
            1L
        ));

        runner.addTestCase(new TestCase<>(
            "Binary Partition Split",
            () -> solver.solve(4, 2),
            7L
        ));

        runner.addTestCase(new TestCase<>(
            "Excess Subsets Underflow",
            () -> solver.solve(2, 3),
            0L
        ));

        runner.addTestCase(new TestCase<>(
            "Five Items Triplet Groups",
            () -> solver.solve(5, 3),
            25L
        ));

        runner.addTestCase(new TestCase<>(
            "Five Items Dual Groups",
            () -> solver.solve(5, 2),
            15L
        ));

        runner.addTestCase(new TestCase<>(
            "Six Items Triplet Groups",
            () -> solver.solve(6, 3),
            90L
        ));

        runner.runTests("PartitionIntoSubsetsDebugTest", false);
    }
}
