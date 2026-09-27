// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PathToLeaf.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PathToLeafTest {

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
        int[] treeA = {50, 25, 12, -1, -1, 37, 30, -1, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] treeD = {5, 10, -1, -1, 15, -1, -1};
        int[] emptyTree = {};

        List<TestCase<Input, String[]>> testCases = List.of(
            new TestCase<>("Medium Range Covering Multiple Paths", new Input(treeA, 100, 200), new String[]{"50 25 37 30", "50 75 62"}),
            new TestCase<>("Tight Range Matching First Leaf", new Input(treeA, 80, 90), new String[]{"50 25 12"}),
            new TestCase<>("High Bound Matching Rightmost Leaf", new Input(treeA, 210, 220), new String[]{"50 75 87"}),
            new TestCase<>("Wide Range Encompassing All Leaves", new Input(treeA, 50, 250), new String[]{"50 25 12", "50 25 37 30", "50 75 62", "50 75 87"}),
            new TestCase<>("Out of Range Query Returns Empty", new Input(treeA, 300, 400), new String[]{}),
            new TestCase<>("Single Root Leaf Node Match", new Input(singleNode, 10, 10), new String[]{"10"}),
            new TestCase<>("Single Root Leaf Node Miss", new Input(singleNode, 0, 5), new String[]{}),
            new TestCase<>("Left Skewed Unilateral Path", new Input(leftSkewed, 50, 70), new String[]{"10 20 30"}),
            new TestCase<>("Balanced Two Leaf Left Selection", new Input(treeD, 15, 18), new String[]{"5 10"}),
            new TestCase<>("Empty Tree Input", new Input(emptyTree, 0, 100), new String[]{})
        );

        TestRunner<Input, String[]> runner = new TestRunner<>();

        runner.runTests(
            "Path to Leaf",
            testCases,
            input -> PathToLeaf.solve(input.arr, input.low, input.high),
            true
        );
    }
}
