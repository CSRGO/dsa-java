// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DiameterBinaryTree.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DiameterBinaryTreeTest {

    public static void main(String[] args) {
        int[] fullTree = {50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] threeNodeTree = {50, 25, -1, -1, 75, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] twoNodesLeft = {10, 20, -1, -1, -1};
        int[] twoNodesRight = {10, -1, 30, -1, -1};
        int[] deepSubtree = {50, 25, 12, 6, -1, -1, 7, -1, -1, 37, 30, -1, -1, 40, -1, -1, -1};
        int[] zigzagTree = {10, 20, -1, 30, -1, -1, -1};

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Full Binary Tree Spanning Leaf to Leaf", fullTree, 4),
            new TestCase<>("Balanced Three Node Tree", threeNodeTree, 2),
            new TestCase<>("Single Node Zero Diameter", singleNode, 0),
            new TestCase<>("Empty Tree Bounds Check", emptyTree, 0),
            new TestCase<>("Left Skewed Unilateral Path", leftSkewed, 2),
            new TestCase<>("Right Skewed Unilateral Path", rightSkewed, 2),
            new TestCase<>("Two Nodes Left Branch", twoNodesLeft, 1),
            new TestCase<>("Two Nodes Right Branch", twoNodesRight, 1),
            new TestCase<>("Longest Path Disconnected from Root", deepSubtree, 4),
            new TestCase<>("Zigzag Left-Right Structure", zigzagTree, 2)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Diameter (Binary Tree)",
            testCases,
            input -> DiameterBinaryTree.solve(input),
            true
        );
    }
}
