// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LargestBSTSubtree.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LargestBSTSubtreeDebugTest {

    public static void main(String[] args) {
        int[] partialBST = {10, 5, 1, -1, -1, 8, -1, -1, 15, -1, 7, -1, -1};
        int[] fullBST = {50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] invertedChildren = {10, 20, -1, -1, 5, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};
        int[] brokenBranch = {10, -1, 30, 20, -1, -1, 5, -1, -1};
        int[] duplicateSymmetric = {1, 2, -1, -1, 2, -1, -1};
        int[] threeNodeBST = {2, 1, -1, -1, 3, -1, -1};

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Subtree Valid while Ancestor Invalid", partialBST, 3),
            new TestCase<>("Entire Tree Forms Seven Node BST", fullBST, 7),
            new TestCase<>("Single Node Trivial BST", singleNode, 1),
            new TestCase<>("Empty Tree Bounds Check", emptyTree, 0),
            new TestCase<>("Inverted Child Ordering Root Invalid", invertedChildren, 1),
            new TestCase<>("Right Skewed Monotonic Valid Chain", rightSkewed, 3),
            new TestCase<>("Left Skewed Monotonic Valid Chain", leftSkewed, 3),
            new TestCase<>("Subtree Right Child Order Violation", brokenBranch, 1),
            new TestCase<>("Duplicate Symmetric Values Disallow BST", duplicateSymmetric, 1),
            new TestCase<>("Three Node Perfectly Balanced BST", threeNodeBST, 3)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Largest BST Subtree (DEBUG)",
            testCases,
            input -> LargestBSTSubtreeDebug.solve(input),
            false
        );
    }
}
