// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.EditDistance.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;

// Problem Link: https://csrgo.com/problems/edit-distance
public class EditDistanceDebugTest {
    // To run tests, execute the main method below:
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        EditDistanceDebug solver = new EditDistanceDebug();

        runner.addTestCase(new TestCase<>(
            "Standard Transformation Sequence",
            () -> solver.solve("horse", "ros"),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Multi Operation Complex Sequence",
            () -> solver.solve("intention", "execution"),
            5
        ));

        runner.addTestCase(new TestCase<>(
            "Dual Empty String Inputs",
            () -> solver.solve("", ""),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Single Character Depletion",
            () -> solver.solve("a", ""),
            1
        ));

        runner.addTestCase(new TestCase<>(
            "Character Insertion From Empty",
            () -> solver.solve("", "abc"),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Direct Identity Match",
            () -> solver.solve("hello", "hello"),
            0
        ));

        runner.addTestCase(new TestCase<>(
            "Phonetic Proximity Transition",
            () -> solver.solve("kitten", "sitting"),
            3
        ));

        runner.addTestCase(new TestCase<>(
            "Boundary Deletion And Insertion",
            () -> solver.solve("flaw", "lawn"),
            2
        ));

        runner.addTestCase(new TestCase<>(
            "Common Substring Alignment",
            () -> solver.solve("sea", "eat"),
            2
        ));

        runner.addTestCase(new TestCase<>(
            "Displaced Two Character Alignment",
            () -> solver.solve("ab", "bc"),
            2
        ));

        runner.runTests("EditDistanceDebugTest", false);
    }
}
