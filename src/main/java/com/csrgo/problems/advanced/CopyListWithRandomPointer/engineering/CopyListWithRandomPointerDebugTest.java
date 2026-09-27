// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CopyListWithRandomPointer.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class CopyListWithRandomPointerDebugTest {

    static class TestCase {
        final int[][] input;
        final int[][] expected;
        final String description;

        TestCase(int[][] input, int[][] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[][]{{7, -1}, {13, 0}, {11, 4}, {10, 2}, {1, 0}}, new int[][]{{7, -1}, {13, 0}, {11, 4}, {10, 2}, {1, 0}}, "Standard 5 nodes list with mixed random pointers"),
            new TestCase(new int[][]{{1, 1}, {2, 1}}, new int[][]{{1, 1}, {2, 1}}, "Two nodes with random pointing to second node"),
            new TestCase(new int[][]{{3, -1}, {3, 0}, {3, -1}}, new int[][]{{3, -1}, {3, 0}, {3, -1}}, "Three nodes with duplicate values"),
            new TestCase(new int[][]{}, new int[][]{}, "Empty list"),
            new TestCase(new int[][]{{1, -1}}, new int[][]{{1, -1}}, "Single node with null random"),
            new TestCase(new int[][]{{1, 0}}, new int[][]{{1, 0}}, "Single node pointing to itself"),
            new TestCase(new int[][]{{10, 2}, {20, 0}, {30, 1}}, new int[][]{{10, 2}, {20, 0}, {30, 1}}, "Circular permutation of random pointers"),
            new TestCase(new int[][]{{5, -1}, {6, -1}, {7, -1}}, new int[][]{{5, -1}, {6, -1}, {7, -1}}, "All random pointers null"),
            new TestCase(new int[][]{{1, 0}, {2, 1}, {3, 2}}, new int[][]{{1, 0}, {2, 1}, {3, 2}}, "All nodes point to themselves as random"),
            new TestCase(new int[][]{{100, 3}, {200, 2}, {300, 1}, {400, 0}}, new int[][]{{100, 3}, {200, 2}, {300, 1}, {400, 0}}, "Reversed random pointer assignment")
        );

        TestRunner.runTests(
            tests,
            t -> CopyListWithRandomPointerDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
