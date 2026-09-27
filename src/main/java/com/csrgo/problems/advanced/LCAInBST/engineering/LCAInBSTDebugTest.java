// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LCAInBST.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LCAInBSTDebugTest {

    static class Input {
        final int[] arr;
        final int d1;
        final int d2;

        Input(int[] arr, int d1, int d2) {
            this.arr = arr;
            this.d1 = d1;
            this.d2 = d2;
        }
    }

    public static void main(String[] args) {
        int[] treeA = {6, 2, 0, -1, -1, 4, 3, -1, -1, 5, -1, -1, 8, 7, -1, -1, 9, -1, -1};
        int[] treeB = {2, 1, -1, -1, 3, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Opposite Subtrees Across Root", new Input(treeA, 2, 8), 6),
            new TestCase<>("Ancestor and Descendant Boundary", new Input(treeA, 2, 4), 2),
            new TestCase<>("Subtree Lowest Common Split", new Input(treeA, 3, 5), 4),
            new TestCase<>("Right Subtree Sibling Split", new Input(treeA, 7, 9), 8),
            new TestCase<>("Left Subtree Diverse Depth Nodes", new Input(treeA, 0, 5), 2),
            new TestCase<>("Three Node Tree Across Root", new Input(treeB, 1, 3), 2),
            new TestCase<>("Three Node Tree Left Child and Root", new Input(treeB, 1, 2), 2),
            new TestCase<>("Single Node Tree Self Ancestor", new Input(singleNode, 10, 10), 10),
            new TestCase<>("Left Skewed Unilateral Direct Ancestor", new Input(leftSkewed, 10, 20), 20),
            new TestCase<>("Right Skewed Unilateral Direct Ancestor", new Input(rightSkewed, 20, 30), 20)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "LCA in BST (DEBUG)",
            testCases,
            input -> LCAInBSTDebug.solve(input.arr, input.d1, input.d2),
            false
        );
    }
}
