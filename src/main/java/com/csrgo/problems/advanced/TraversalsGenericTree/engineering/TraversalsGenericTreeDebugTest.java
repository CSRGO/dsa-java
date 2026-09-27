// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TraversalsGenericTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class TraversalsGenericTreeDebugTest {

    static class TestCase {
        final int[] input;
        final int[][] expected;
        final String description;

        TestCase(int[] input, int[][] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        List<TestCase> tests = Arrays.asList(
            new TestCase(new int[]{10, 20, -1, 30, -1, -1}, new int[][]{{10, 20, 30}, {20, 30, 10}}, "Root with two children"),
            new TestCase(new int[]{10, 20, 50, -1, 60, -1, -1, 30, -1, -1}, new int[][]{{10, 20, 50, 60, 30}, {50, 60, 20, 30, 10}}, "Tree with two levels of children"),
            new TestCase(new int[]{}, new int[][]{{}, {}}, "Empty tree"),
            new TestCase(new int[]{10, -1}, new int[][]{{10}, {10}}, "Single node tree"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1}, new int[][]{{10, 20, 30}, {30, 20, 10}}, "Linear chain of 3 nodes"),
            new TestCase(new int[]{1, 2, -1, 3, -1, 4, -1, -1}, new int[][]{{1, 2, 3, 4}, {2, 3, 4, 1}}, "Root with 3 direct leaf children"),
            new TestCase(new int[]{100, 200, -1, -1}, new int[][]{{100, 200}, {200, 100}}, "Parent with single child"),
            new TestCase(new int[]{1, 2, 4, -1, -1, 3, 5, -1, -1, -1}, new int[][]{{1, 2, 4, 3, 5}, {4, 2, 5, 3, 1}}, "Two symmetric subtrees"),
            new TestCase(new int[]{5, 10, 15, 20, -1, -1, -1, -1}, new int[][]{{5, 10, 15, 20}, {20, 15, 10, 5}}, "Deep 4-level linear chain"),
            new TestCase(new int[]{10, 20, 30, -1, 40, -1, -1, -1}, new int[][]{{10, 20, 30, 40}, {30, 40, 20, 10}}, "Subtree with multiple siblings")
        );

        TestRunner.runTests(
            tests,
            t -> TraversalsGenericTreeDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
