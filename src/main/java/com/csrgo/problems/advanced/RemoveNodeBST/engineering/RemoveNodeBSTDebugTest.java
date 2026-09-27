// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveNodeBST.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RemoveNodeBSTDebugTest {

    static class Input {
        final int[] arr;
        final int val;

        Input(int[] arr, int val) {
            this.arr = arr;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] fullTree = {5, 3, 2, -1, -1, 4, -1, -1, 6, -1, 7, -1, -1};
        int[] threeNode = {5, 3, -1, -1, 6, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] leftOnly = {5, 3, 2, -1, -1, -1, 6, -1, -1};
        int[] rightOnly = {5, 3, -1, 4, -1, -1, 6, -1, -1};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Delete Node with Two Children", new Input(fullTree, 3), new int[]{5, 2, 4, 6, 7}),
            new TestCase<>("Delete Root Node with Two Children", new Input(threeNode, 5), new int[]{3, 6}),
            new TestCase<>("Delete Left Leaf Node", new Input(threeNode, 3), new int[]{5, 6}),
            new TestCase<>("Delete Right Leaf Node", new Input(threeNode, 6), new int[]{5, 3}),
            new TestCase<>("Delete Sole Root Node Leaving Empty", new Input(singleNode, 10), new int[]{}),
            new TestCase<>("Empty Tree Returns Empty Array", new Input(new int[]{}, 5), new int[]{}),
            new TestCase<>("Delete Non-Existent Key Invariant", new Input(threeNode, 10), new int[]{5, 3, 6}),
            new TestCase<>("Delete Node Having Left Child Only", new Input(leftOnly, 3), new int[]{5, 2, 6}),
            new TestCase<>("Delete Node Having Right Child Only", new Input(rightOnly, 3), new int[]{5, 4, 6}),
            new TestCase<>("Delete Intermediate in Skewed Chain", new Input(leftSkewed, 20), new int[]{30, 10})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Remove Node (BST) (DEBUG)",
            testCases,
            input -> RemoveNodeBSTDebug.solve(input.arr, input.val),
            false
        );
    }
}
