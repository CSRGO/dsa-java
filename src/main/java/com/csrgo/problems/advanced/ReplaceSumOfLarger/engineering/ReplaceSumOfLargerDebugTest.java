// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ReplaceSumOfLarger.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ReplaceSumOfLargerDebugTest {

    public static void main(String[] args) {
        int[] threeNodeTree = {50, 25, -1, -1, 75, -1, -1};
        int[] fullTree = {50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] twoNodeLeft = {20, 10, -1, -1, -1};
        int[] twoNodeRight = {10, -1, 20, -1, -1};
        int[] fourNode = {10, 5, -1, -1, 20, 15, -1, -1, -1};
        int[] zeroLeaf = {1, 0, -1, -1, -1};

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Balanced Three Node Tree", threeNodeTree, new int[]{75, 125, 0}),
            new TestCase<>("Seven Node Full BST Multi-Tier", fullTree, new int[]{224, 311, 336, 274, 87, 162, 0}),
            new TestCase<>("Single Node Replaced with Zero", singleNode, new int[]{0}),
            new TestCase<>("Empty Tree Returns Empty Array", emptyTree, new int[]{}),
            new TestCase<>("Left Skewed Ascending Reversal", leftSkewed, new int[]{0, 30, 50}),
            new TestCase<>("Right Skewed Descending Reversal", rightSkewed, new int[]{50, 30, 0}),
            new TestCase<>("Two Nodes Left Child Only", twoNodeLeft, new int[]{0, 20}),
            new TestCase<>("Two Nodes Right Child Only", twoNodeRight, new int[]{20, 0}),
            new TestCase<>("Four Node Asymmetric BST", fourNode, new int[]{35, 45, 0, 20}),
            new TestCase<>("Two Node Tree with Zero Leaf", zeroLeaf, new int[]{0, 1})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Replace Sum of Larger (DEBUG)",
            testCases,
            input -> ReplaceSumOfLargerDebug.solve(input),
            false
        );
    }
}
