// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LinearizeTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class LinearizeTreeDebugTest {

    static class TestCase {
        final int[] input;
        final int[] expected;
        final String description;

        TestCase(int[] input, int[] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[]{10, 20, 50, -1, 60, -1, -1, 30, -1, 40, -1, -1}, new int[]{10, 20, 50, 60, 30, 40}, "Root with 3 branches linearized into single chain"),
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, new int[]{10, 20, 30}, "Root with two children flattened"),
            new TestCase(new int[]{}, new int[]{}, "Empty tree"),
            new TestCase(new int[]{10, -1}, new int[]{10}, "Single node tree is already linear"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, new int[]{10, 20, 30}, "Already linear chain remains unchanged"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, new int[]{1, 2, 3, 4}, "Root with multiple leaves linearized"),
            new TestCase(new int[]{100, 200, -1, -1}, new int[]{100, 200}, "Parent and single child"),
            new TestCase(new int[]{1, 2, 4, -1, -1, 3, 5, -1, -1, -1}, new int[]{1, 2, 4, 3, 5}, "Two symmetric branches flattened into sequential chain"),
            new TestCase(new int[]{10, 20, 30, -1, 40, -1, -1, 50, -1, -1}, new int[]{10, 20, 30, 40, 50}, "Nested subtrees linearized"),
            new TestCase(new int[]{5, 10, 15, -1, 20, -1, -1, 25, 30, -1, -1, -1}, new int[]{5, 10, 15, 20, 25, 30}, "Multi-level branching tree linearized")
        );

        TestRunner.runTests(
            tests,
            t -> LinearizeTreeDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
