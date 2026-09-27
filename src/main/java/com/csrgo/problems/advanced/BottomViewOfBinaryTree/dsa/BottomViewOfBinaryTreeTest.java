// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BottomViewOfBinaryTree.dsa;

import java.util.*;
import com.csrgo.util.*;

public class BottomViewOfBinaryTreeTest {

    public static void main(String[] args) {
        int[] multiLevel = {20, 8, 5, -1, -1, 3, 10, -1, -1, 14, -1, -1, 22, -1, 25, -1, -1};
        int[] symmetricTree = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] threeNodeTree = {1, 2, -1, -1, 3, -1, -1};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] onlyLeft = {1, 2, -1, -1, -1};
        int[] onlyRight = {1, -1, 2, -1, -1};
        int[] zigzagTree = {10, 20, -1, 30, -1, -1, -1};

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Multi-Level Overwritten Apex Subtrees", multiLevel, new int[]{5, 10, 3, 14, 25}),
            new TestCase<>("Five Column Symmetric Complete Tree", symmetricTree, new int[]{4, 2, 6, 3, 7}),
            new TestCase<>("Single Node Column Zero Only", singleNode, new int[]{10}),
            new TestCase<>("Empty Tree Returns Empty Array", emptyTree, new int[]{}),
            new TestCase<>("Three Node Balanced Minimal Tree", threeNodeTree, new int[]{2, 1, 3}),
            new TestCase<>("Left Skewed Strictly Decreasing Columns", leftSkewed, new int[]{30, 20, 10}),
            new TestCase<>("Right Skewed Strictly Increasing Columns", rightSkewed, new int[]{10, 20, 30}),
            new TestCase<>("Root with Left Child Only", onlyLeft, new int[]{2, 1}),
            new TestCase<>("Root with Right Child Only", onlyRight, new int[]{1, 2}),
            new TestCase<>("Zigzag Node Overwrites Ancestor", zigzagTree, new int[]{20, 30})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Bottom View of Binary Tree",
            testCases,
            input -> BottomViewOfBinaryTree.solve(input),
            true
        );
    }
}
