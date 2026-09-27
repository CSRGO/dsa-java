// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveLeavesBinaryTree.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RemoveLeavesBinaryTreeDebugTest {

    public static void main(String[] args) {
        int[] fullTree = {50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] threeNodeTree = {50, 25, -1, -1, 75, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] onlyLeft = {10, 20, -1, -1, -1};
        int[] onlyRight = {10, -1, 30, -1, -1};
        int[] asymmetric = {100, 50, 25, -1, -1, -1, 150, -1, -1};
        int[] zigzagTree = {10, 20, -1, 30, -1, -1, -1};

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Full Binary Tree Prunes All Four Leaves", fullTree, new int[]{50, 25, 75}),
            new TestCase<>("Balanced Three Node Tree Retains Root", threeNodeTree, new int[]{50}),
            new TestCase<>("Single Node Pruned to Empty", singleNode, new int[]{}),
            new TestCase<>("Empty Tree Bounds Check", emptyTree, new int[]{}),
            new TestCase<>("Left Skewed Terminal Pruned", leftSkewed, new int[]{10, 20}),
            new TestCase<>("Right Skewed Terminal Pruned", rightSkewed, new int[]{10, 20}),
            new TestCase<>("Root with Left Child Only", onlyLeft, new int[]{10}),
            new TestCase<>("Root with Right Child Only", onlyRight, new int[]{10}),
            new TestCase<>("Asymmetric Subtree Pruning", asymmetric, new int[]{100, 50}),
            new TestCase<>("Zigzag Terminal Leaf Pruned", zigzagTree, new int[]{10, 20})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Remove Leaves (Binary Tree) (DEBUG)",
            testCases,
            input -> RemoveLeavesBinaryTreeDebug.solve(input),
            false
        );
    }
}
