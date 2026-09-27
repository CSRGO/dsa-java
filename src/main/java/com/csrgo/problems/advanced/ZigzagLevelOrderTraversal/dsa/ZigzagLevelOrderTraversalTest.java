// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ZigzagLevelOrderTraversal.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ZigzagLevelOrderTraversalTest {

    public static void main(String[] args) {
        int[] fiveNodeTree = {3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        int[] fullTree = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] threeNodeTree = {1, 2, -1, -1, 3, -1, -1};
        int[] zigzagTree = {1, 2, -1, 4, -1, -1, 3, -1, -1};
        int[] rightHeavy = {10, -1, 20, 15, -1, -1, 25, -1, -1};
        int[] twoNodesLeft = {1, 2, -1, -1, -1};

        List<TestCase<int[], int[][]>> testCases = List.of(
            new TestCase<>("Five Node Asymmetric Tree", fiveNodeTree, new int[][]{{3}, {20, 9}, {15, 7}}),
            new TestCase<>("Seven Node Full Binary Tree", fullTree, new int[][]{{1}, {3, 2}, {4, 5, 6, 7}}),
            new TestCase<>("Single Node Root Only", singleNode, new int[][]{{10}}),
            new TestCase<>("Empty Tree Returns Empty Array", emptyTree, new int[][]{}),
            new TestCase<>("Left Skewed Unilateral Chain", leftSkewed, new int[][]{{10}, {20}, {30}}),
            new TestCase<>("Right Skewed Unilateral Chain", rightSkewed, new int[][]{{10}, {20}, {30}}),
            new TestCase<>("Three Node Minimal Inverted Level", threeNodeTree, new int[][]{{1}, {3, 2}}),
            new TestCase<>("Four Node Alternating Depth Tree", zigzagTree, new int[][]{{1}, {3, 2}, {4}}),
            new TestCase<>("Right Subtree Branching", rightHeavy, new int[][]{{10}, {20}, {15, 25}}),
            new TestCase<>("Two Nodes Left Child Only", twoNodesLeft, new int[][]{{1}, {2}})
        );

        TestRunner<int[], int[][]> runner = new TestRunner<>();

        runner.runTests(
            "Zigzag Level Order Traversal",
            testCases,
            input -> ZigzagLevelOrderTraversal.solve(input),
            true
        );
    }
}
