// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SizeSumMaxHeight.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class SizeSumMaxHeightDebugTest {

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
        int[] standardTree = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        List<TestCase> tests = Arrays.asList(
            new TestCase(standardTree, new int[]{12, 780, 120, 3}, "Standard 12-node generic tree metrics"),
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, new int[]{3, 60, 30, 1}, "Root with two children"),
            new TestCase(new int[]{}, new int[]{0, 0, 0, -1}, "Empty tree"),
            new TestCase(new int[]{10, -1}, new int[]{1, 10, 10, 0}, "Single node tree"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, new int[]{3, 60, 30, 2}, "Linear chain of 3 nodes"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, new int[]{4, 10, 4, 1}, "Root with 3 leaves"),
            new TestCase(new int[]{100, 200, -1, -1}, new int[]{2, 300, 200, 1}, "Parent and single child"),
            new TestCase(new int[]{5, 10, 15, 20, -1, -1, -1, -1}, new int[]{4, 50, 20, 3}, "Deep linear chain of 4 nodes"),
            new TestCase(new int[]{1, 2, 4, -1, -1, 3, 5, -1, -1, -1}, new int[]{5, 15, 5, 2}, "Two symmetric branches"),
            new TestCase(new int[]{50, 25, -1, 75, -1, -1}, new int[]{3, 150, 75, 1}, "Binary-like generic node")
        );

        TestRunner.runTests(
            tests,
            t -> SizeSumMaxHeightDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
