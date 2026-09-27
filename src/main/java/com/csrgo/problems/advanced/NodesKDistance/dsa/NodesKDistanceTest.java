// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NodesKDistance.dsa;

import com.csrgo.runner.TestRunner;
import java.util.*;

public class NodesKDistanceTest {

    static class Input {
        final int[] arr;
        final int target;
        final int k;

        Input(int[] arr, int target, int k) {
            this.arr = arr;
            this.target = target;
            this.k = k;
        }
    }

    static class TestCase {
        final Input input;
        final int[] expected;
        final String description;

        TestCase(Input input, int[] expected, String description) {
            this.input = input;
            this.expected = expected;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        int[] treeA = {50, 25, 12, -1, -1, 37, 30, -1, -1, 40, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] treeB = {50, 25, -1, -1, 75, -1, -1};
        int[] singleNode = {10, -1, -1};

        List<TestCase> tests = Arrays.asList(
            new TestCase(new Input(treeA, 37, 1), new int[]{30, 40, 25}, "Direct neighbors at distance 1"),
            new TestCase(new Input(treeA, 37, 2), new int[]{12, 50}, "Nodes at distance 2 from internal node"),
            new TestCase(new Input(treeA, 50, 1), new int[]{25, 75}, "Immediate children of root at distance 1"),
            new TestCase(new Input(treeA, 50, 0), new int[]{50}, "Distance 0 returns target itself"),
            new TestCase(new Input(treeA, 12, 2), new int[]{37, 50}, "Distance 2 from leaf node"),
            new TestCase(new Input(treeB, 50, 1), new int[]{25, 75}, "Both branches of balanced 3 node tree"),
            new TestCase(new Input(treeB, 25, 1), new int[]{50}, "Parent of left child at distance 1"),
            new TestCase(new Input(treeB, 25, 2), new int[]{75}, "Sibling node at distance 2"),
            new TestCase(new Input(singleNode, 10, 0), new int[]{10}, "Single node tree distance 0"),
            new TestCase(new Input(treeA, 37, 5), new int[]{}, "Distance exceeding tree diameter returns empty")
        );

        TestRunner.runTests(
            tests,
            t -> NodesKDistance.solve(t.input.arr, t.input.target, t.input.k),
            t -> t.expected,
            true,
            t -> t.description
        );
    }
}
