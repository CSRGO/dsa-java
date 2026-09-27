// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SizeOfGenericTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class SizeOfGenericTreeDebugTest {

    static class TestCase {
        final int[] input;
        final int expected;
        final String description;

        TestCase(int[] input, int expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1}, 12, "Standard multi-level generic tree of 12 nodes"),
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, 3, "Root with two children"),
            new TestCase(new int[]{}, 0, "Empty generic tree array"),
            new TestCase(new int[]{10, -1}, 1, "Single node tree"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, 3, "Linear single-branch tree (skewed)"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, 5, -1, -1}, 5, "Root with 4 leaf children"),
            new TestCase(new int[]{10, 20, 30, 40, 50, -1, -1, -1, -1, -1}, 5, "Deeply nested single-child chain of 5 nodes"),
            new TestCase(new int[]{1, 2, 3, -1, 4, -1, -1, 5, 6, -1, -1, -1}, 6, "Two-subtrees symmetric generic tree"),
            new TestCase(new int[]{100, 200, -1, -1}, 2, "Parent and one child"),
            new TestCase(new int[]{10, 20, 30, -1, 40, -1, -1, 50, 60, -1, 70, -1, -1, -1}, 7, "Balanced 7 node generic tree")
        );

        TestRunner.runTests(
            tests,
            t -> SizeOfGenericTreeDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
