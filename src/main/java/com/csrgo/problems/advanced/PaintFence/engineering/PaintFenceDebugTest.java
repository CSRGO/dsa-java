// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PaintFence.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/paint-fence
public class PaintFenceDebugTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        PaintFenceDebug solver = new PaintFenceDebug();

        runner.addTestCase(new TestCase<>(
            "Three Posts Two Colors Sample",
            () -> solver.solve(3, 2),
            6
        ));

        runner.addTestCase(new TestCase<>(
            "Single Post Multiple Colors Setup",
            () -> solver.solve(1, 7),
            7
        ));

        runner.addTestCase(new TestCase<>(
            "Zero Posts Base Case",
            () -> solver.solve(0, 5),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Two Posts Four Colors Evaluation",
            () -> solver.solve(2, 4),
            16
        ));

        runner.addTestCase(new TestCase<>(
            "Three Posts Tri-Color Arrangement",
            () -> solver.solve(3, 3),
            24
        ));

        runner.addTestCase(new TestCase<>(
            "Four Posts Binary Color Allocation",
            () -> solver.solve(4, 2),
            10
        ));

        runner.addTestCase(new TestCase<>(
            "Two Posts Monochromatic Palette",
            () -> solver.solve(2, 1),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Three Posts Monochromatic Boundary",
            () -> solver.solve(3, 1),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Five Posts Tri-Color Combinations",
            () -> solver.solve(5, 3),
            180
        ));

        runner.addTestCase(new TestCase<>(
            "Five Posts Monochromatic Restriction",
            () -> solver.solve(5, 1),
            0
        ));

        runner.runTests("PaintFenceDebugTest", false);
    }
}
