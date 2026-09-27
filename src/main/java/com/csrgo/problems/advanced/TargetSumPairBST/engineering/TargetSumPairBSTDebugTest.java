// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TargetSumPairBST.engineering;

import java.util.*;
import com.csrgo.util.*;

public class TargetSumPairBSTDebugTest {

    static class Input {
        final int[] arr;
        final int target;

        Input(int[] arr, int target) {
            this.arr = arr;
            this.target = target;
        }
    }

    public static void main(String[] args) {
        int[] treeA = {5, 3, 2, -1, -1, 4, -1, -1, 6, -1, 7, -1, -1};
        int[] treeB = {2, 1, -1, -1, 3, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};

        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>("Six Node Tree Complementary Pair", new Input(treeA, 9), true),
            new TestCase<>("Target Exceeds Maximum Possible Pair", new Input(treeA, 28), false),
            new TestCase<>("Smallest Pair Match in Subtree", new Input(treeA, 5), true),
            new TestCase<>("Largest Pair Match in Subtree", new Input(treeA, 13), true),
            new TestCase<>("Single Node Doubling Disallowed", new Input(treeA, 4), false),
            new TestCase<>("Three Node Tree Left and Root", new Input(treeB, 3), true),
            new TestCase<>("Three Node Tree Left and Right", new Input(treeB, 4), true),
            new TestCase<>("Single Node Tree Insufficient Elements", new Input(singleNode, 20), false),
            new TestCase<>("Empty Tree Returns False", new Input(emptyTree, 0), false),
            new TestCase<>("Left Skewed Chain Valid Sum", new Input(leftSkewed, 50), true)
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Target Sum Pair (BST) (DEBUG)",
            testCases,
            input -> TargetSumPairBSTDebug.solve(input.arr, input.target),
            false
        );
    }
}
