// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.EditDistance.dsa;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/edit-distance
public class EditDistanceTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        EditDistance solver = new EditDistance();

        runner.addTestCase(new TestCase<>(
            "Standard Example 1",
            () -> solver.solve("horse", "ros"),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Standard Example 2",
            () -> solver.solve("intention", "execution"),
            5
        ));

        runner.addTestCase(new TestCase<>(
            "Both Empty Strings",
            () -> solver.solve("", ""),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Single Character To Empty",
            () -> solver.solve("a", ""),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Empty To Multi Character",
            () -> solver.solve("", "abc"),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Identical Strings",
            () -> solver.solve("hello", "hello"),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Classic Kitten Sitting",
            () -> solver.solve("kitten", "sitting"),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Flaw To Lawn Shift",
            () -> solver.solve("flaw", "lawn"),
            2
        ));

        runner.addTestCase(new TestCase<>(
            "Sea To Eat Overlap",
            () -> solver.solve("sea", "eat"),
            2
        ));

        runner.addTestCase(new TestCase<>(
            "Displaced Characters",
            () -> solver.solve("ab", "bc"),
            2
        ));

        runner.runTests("EditDistanceTest", true);
    }
}
