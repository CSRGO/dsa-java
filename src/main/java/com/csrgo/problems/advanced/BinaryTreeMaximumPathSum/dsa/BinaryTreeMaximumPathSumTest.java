// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BinaryTreeMaximumPathSum.dsa;

import java.util.*;
import com.csrgo.util.*;

public class BinaryTreeMaximumPathSumTest {

    public static void main(String[] args) {
        int[] smallPositive = {1, 2, -1, -1, 3, -1, -1};
        int[] mixedSubtree = {-10, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        int[] singlePositive = {10, -1, -1};
        int[] singleNegative = {-5, -1, -1};
        int[] allNegative = {-3, -2, -1, -1, -1, -4, -1, -1};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] negativeChildren = {5, -2, -1, -1, -3, -1, -1};
        int[] mixedSignRoot = {2, -1, -1, -1, -2, -1, -1};
        int[] emptyTree = {};

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Small Three Node Positive Tree", smallPositive, 6),
            new TestCase<>("High Value Subtree with Negative Root", mixedSubtree, 42),
            new TestCase<>("Single Positive Node", singlePositive, 10),
            new TestCase<>("Single Negative Node", singleNegative, -5),
            new TestCase<>("All Negative Values Evaluates Max Element", allNegative, -2),
            new TestCase<>("Left Skewed Unilateral Positive Chain", leftSkewed, 60),
            new TestCase<>("Right Skewed Unilateral Positive Chain", rightSkewed, 60),
            new TestCase<>("Positive Root with Negative Children Discarded", negativeChildren, 5),
            new TestCase<>("Mixed Sign Tree Pruning Both Children", mixedSignRoot, 2),
            new TestCase<>("Empty Tree Bounds Check", emptyTree, 0)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Binary Tree Maximum Path Sum",
            testCases,
            input -> BinaryTreeMaximumPathSum.solve(input),
            true
        );
    }
}
