// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ValidateBST.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ValidateBSTTest {

    public static void main(String[] args) {
        int[] validThreeNode = {2, 1, -1, -1, 3, -1, -1};
        int[] invalidSubtree = {5, 1, -1, -1, 4, 3, -1, -1, 6, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] duplicatesTree = {2, 2, -1, -1, 2, -1, -1};
        int[] validFullTree = {50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};
        int[] invertedChildren = {10, 20, -1, -1, 5, -1, -1};
        int[] twoNodes = {10, 5, -1, -1, -1};

        List<TestCase<int[], Boolean>> testCases = List.of(
            new TestCase<>("Classic Three Node Valid BST", validThreeNode, true),
            new TestCase<>("Ancestor Invariant Violated Deep in Right Subtree", invalidSubtree, false),
            new TestCase<>("Single Node Trivial Valid BST", singleNode, true),
            new TestCase<>("Empty Tree Defined as Valid BST", emptyTree, true),
            new TestCase<>("Duplicate Node Values Disallow Strict BST", duplicatesTree, false),
            new TestCase<>("Seven Node Full Balanced Valid BST", validFullTree, true),
            new TestCase<>("Right Skewed Monotonically Increasing Valid BST", rightSkewed, true),
            new TestCase<>("Left Skewed Monotonically Decreasing Valid BST", leftSkewed, true),
            new TestCase<>("Direct Child Inversion at Root", invertedChildren, false),
            new TestCase<>("Two Nodes Left Child Valid", twoNodes, true)
        );

        TestRunner<int[], Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Validate BST",
            testCases,
            input -> ValidateBST.solve(input),
            true
        );
    }
}
