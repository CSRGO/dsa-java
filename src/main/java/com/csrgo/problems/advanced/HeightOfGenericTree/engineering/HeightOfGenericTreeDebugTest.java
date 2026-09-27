// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HeightOfGenericTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class HeightOfGenericTreeDebugTest {

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
            new TestCase(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1}, 3, "Standard multi-level tree with height 3"),
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, 1, "Root with direct leaves height 1"),
            new TestCase(new int[]{}, -1, "Empty tree returns -1"),
            new TestCase(new int[]{10, -1}, 0, "Single node tree has height 0"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, 2, "Skewed line of 3 nodes has height 2"),
            new TestCase(new int[]{10, 20, 30, 40, -1, -1, -1, -1}, 3, "Four nodes single branch has height 3"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, 5, -1, -1}, 1, "Star tree with 4 direct leaf children height 1"),
            new TestCase(new int[]{1, 2, 3, -1, -1, 4, 5, 6, -1, -1, -1, -1}, 3, "Unbalanced subtrees with max height 3"),
            new TestCase(new int[]{100, 200, -1, -1}, 1, "Two nodes single edge"),
            new TestCase(new int[]{1, 2, 3, 4, 5, -1, -1, -1, -1, -1}, 4, "Five nodes linear chain height 4")
        );

        TestRunner.runTests(
            tests,
            t -> HeightOfGenericTreeDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
