// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LevelOrderBinaryTree.engineering;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class LevelOrderBinaryTreeDebugTest {

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
            new TestCase(new int[]{50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1}, new int[]{50, 25, 75, 12, 37, 62, 87}, "Standard 7 nodes 3 levels balanced binary tree"),
            new TestCase(new int[]{10, 20, -1, -1, 30, -1, -1}, new int[]{10, 20, 30}, "Root with two children"),
            new TestCase(new int[]{}, new int[]{}, "Empty binary tree"),
            new TestCase(new int[]{10, -1, -1}, new int[]{10}, "Single node tree"),
            new TestCase(new int[]{10, 20, 30, -1, -1, -1, -1}, new int[]{10, 20, 30}, "Left skewed 3-node chain"),
            new TestCase(new int[]{10, -1, 20, -1, 30, -1, -1}, new int[]{10, 20, 30}, "Right skewed 3-node chain"),
            new TestCase(new int[]{1, 2, -1, -1, -1}, new int[]{1, 2}, "Root with single left child"),
            new TestCase(new int[]{1, -1, 2, -1, -1}, new int[]{1, 2}, "Root with single right child"),
            new TestCase(new int[]{100, 50, 25, -1, -1, -1, 150, -1, -1}, new int[]{100, 50, 150, 25}, "Four nodes asymmetric tree level order"),
            new TestCase(new int[]{4, 2, 1, -1, -1, 3, -1, -1, 6, 5, -1, -1, 7, -1, -1}, new int[]{4, 2, 6, 1, 3, 5, 7}, "Full complete binary tree of 7 nodes")
        );

        TestRunner.runTests(
            tests,
            t -> LevelOrderBinaryTreeDebug.solve(t.input),
            t -> t.expected,
            false,
            t -> t.description
        );
    }
}
