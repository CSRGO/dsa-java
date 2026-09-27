// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrintInRange.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PrintInRangeDebugTest {

    static class Input {
        final int[] arr;
        final int low;
        final int high;

        Input(int[] arr, int low, int high) {
            this.arr = arr;
            this.low = low;
            this.high = high;
        }
    }

    public static void main(String[] args) {
        int[] treeA = {50, 25, 12, -1, -1, 37, 30, -1, -1, 40, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] treeB = {10, 5, -1, -1, 15, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Multi-Level Range Covering Intermediate Nodes", new Input(treeA, 20, 65), new int[]{25, 30, 37, 40, 50, 62}),
            new TestCase<>("Full Range Encompassing All Nodes", new Input(treeA, 12, 87), new int[]{12, 25, 30, 37, 40, 50, 62, 75, 87}),
            new TestCase<>("Left Subtree Internal Range", new Input(treeA, 25, 37), new int[]{25, 30, 37}),
            new TestCase<>("Right Subtree Internal Range", new Input(treeA, 60, 80), new int[]{62, 75}),
            new TestCase<>("Out of Range Query Returns Empty", new Input(treeA, 90, 100), new int[]{}),
            new TestCase<>("Three Node Tree Sub-Range", new Input(treeB, 7, 15), new int[]{10, 15}),
            new TestCase<>("Single Point Match Leaf", new Input(treeB, 5, 5), new int[]{5}),
            new TestCase<>("Single Node Tree Match", new Input(singleNode, 10, 10), new int[]{10}),
            new TestCase<>("Empty Tree Bounds Check", new Input(emptyTree, 0, 100), new int[]{}),
            new TestCase<>("Left Skewed Chain Middle Element", new Input(leftSkewed, 15, 25), new int[]{20})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Print in Range (DEBUG)",
            testCases,
            input -> PrintInRangeDebug.solve(input.arr, input.low, input.high),
            false
        );
    }
}
