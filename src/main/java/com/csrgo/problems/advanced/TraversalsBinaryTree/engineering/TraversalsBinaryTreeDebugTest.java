// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TraversalsBinaryTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class TraversalsBinaryTreeDebugTest {

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
            new TestCase(new int[]{50, 25, -1, -1, 75, -1, -1}, new int[][]{{50, 25, 75}, {25, 50, 75}, {25, 75, 50}}, "Balanced 3 node binary tree"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1, -1}, new int[][]{{10, 20, 30}, {30, 20, 10}, {30, 20, 10}}, "Left skewed chain of 3 nodes"),
            new TestCase(new int[]{}, new int[][]{{}, {}, {}}, "Empty tree"),
            new TestCase(new int[]{10, -1, -1}, new int[][]{{10}, {10}, {10}}, "Single node tree"),
            new TestCase(new int[]{10, -1, 20, -1, 30, -1, -1}, new int[][]{{10, 20, 30}, {10, 20, 30}, {30, 20, 10}}, "Right skewed chain of 3 nodes"),
            new TestCase(new int[]{1, 2, -1, -1, -1}, new int[][]{{1, 2}, {2, 1}, {2, 1}}, "Root with only left child"),
            new TestCase(new int[]{1, -1, 2, -1, -1}, new int[][]{{1, 2}, {1, 2}, {2, 1}}, "Root with only right child"),
            new TestCase(new int[]{4, 2, 1, -1, -1, 3, -1, -1, 6, 5, -1, -1, 7, -1, -1}, new int[][]{{4, 2, 1, 3, 6, 5, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 3, 2, 5, 7, 6, 4}}, "Complete binary tree of 7 nodes"),
            new TestCase(new int[]{100, 50, 25, -1, -1, -1, 150, -1, -1}, new int[][]{{100, 50, 25, 150}, {25, 50, 100, 150}, {25, 50, 150, 100}}, "Four nodes asymmetric binary tree"),
            new TestCase(new int[]{10, 20, -1, 40, -1, -1, 30, -1, -1}, new int[][]{{10, 20, 40, 30}, {20, 40, 10, 30}, {40, 20, 30, 10}}, "Tree with zigzag left-right children")
        );

        TestRunner.runTests(
            tests,
            t -> TraversalsBinaryTreeDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
