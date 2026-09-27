// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BalancedBinaryTree.engineering;

import java.util.*;
import com.csrgo.util.*;

public class BalancedBinaryTreeDebugTest {

    public static void main(String[] args) {
        int[] balancedTree = {3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        int[] unbalancedTree = {1, 2, 3, 4, -1, -1, 4, -1, -1, 3, -1, -1, 2, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] threeNodeBalanced = {1, 2, -1, -1, 3, -1, -1};
        int[] leftSkewed = {1, 2, 3, -1, -1, -1, -1};
        int[] rightSkewed = {1, -1, 2, -1, 3, -1, -1};
        int[] twoNodesLeft = {1, 2, -1, -1, -1};
        int[] twoNodesRight = {1, -1, 2, -1, -1};
        int[] isolatedDeepChain = {1, 2, 3, 4, -1, -1, -1, -1, -1};

        List<TestCase<int[], Boolean>> testCases = List.of(
            new TestCase<>("Classic Balanced Binary Tree", balancedTree, true),
            new TestCase<>("Unbalanced Left Heavy Subtree", unbalancedTree, false),
            new TestCase<>("Single Node Trivial Balance", singleNode, true),
            new TestCase<>("Empty Tree Defined as Balanced", emptyTree, true),
            new TestCase<>("Three Node Perfectly Symmetric", threeNodeBalanced, true),
            new TestCase<>("Left Skewed Unilateral Chain", leftSkewed, false),
            new TestCase<>("Right Skewed Unilateral Chain", rightSkewed, false),
            new TestCase<>("Two Nodes Left Child Allowed", twoNodesLeft, true),
            new TestCase<>("Two Nodes Right Child Allowed", twoNodesRight, true),
            new TestCase<>("Isolated Deep Unilateral Chain", isolatedDeepChain, false)
        );

        TestRunner<int[], Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Balanced Binary Tree (DEBUG)",
            testCases,
            input -> BalancedBinaryTreeDebug.solve(input),
            false
        );
    }
}
