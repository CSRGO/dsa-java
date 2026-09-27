// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PaintFence.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/paint-fence
public class PaintFenceTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        PaintFence solver = new PaintFence();

        runner.addTestCase(new TestCase<>(
            "Standard Example 1",
            () -> solver.solve(3, 2),
            6
        ));

        runner.addTestCase(new TestCase<>(
            "Single Post Multiple Colors",
            () -> solver.solve(1, 7),
            7
        ));

        runner.addTestCase(new TestCase<>(
            "Zero Posts",
            () -> solver.solve(0, 5),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Two Posts Four Colors",
            () -> solver.solve(2, 4),
            16
        ));

        runner.addTestCase(new TestCase<>(
            "Three Posts Three Colors",
            () -> solver.solve(3, 3),
            24
        ));

        runner.addTestCase(new TestCase<>(
            "Four Posts Two Colors",
            () -> solver.solve(4, 2),
            10
        ));

        runner.addTestCase(new TestCase<>(
            "Two Posts Single Color",
            () -> solver.solve(2, 1),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Three Posts Single Color",
            () -> solver.solve(3, 1),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Five Posts Three Colors",
            () -> solver.solve(5, 3),
            180
        ));

        runner.addTestCase(new TestCase<>(
            "Five Posts Single Color Impossible",
            () -> solver.solve(5, 1),
            0
        ));

        runner.runTests("PaintFenceTest", true);
    }
}
