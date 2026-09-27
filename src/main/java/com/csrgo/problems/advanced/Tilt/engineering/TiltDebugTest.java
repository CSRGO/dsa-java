// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Tilt.engineering;

import java.util.*;
import com.csrgo.util.*;

public class TiltDebugTest {

    public static void main(String[] args) {
        int[] smallTree = {1, 2, -1, -1, 3, -1, -1};
        int[] multiLevel = {4, 2, 3, -1, -1, 5, -1, -1, 9, -1, 7, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] symmetric = {1, 2, 4, -1, -1, 5, -1, -1, 2, 5, -1, -1, 4, -1, -1};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] twoLeft = {5, 10, -1, -1, -1};
        int[] twoRight = {5, -1, 10, -1, -1};
        int[] balancedEqual = {10, 5, -1, -1, 5, -1, -1};

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Small Three Node Tree", smallTree, 1),
            new TestCase<>("Multi-Level Asymmetric Tree", multiLevel, 15),
            new TestCase<>("Single Node Tree Zero Tilt", singleNode, 0),
            new TestCase<>("Empty Tree Bounds Check", emptyTree, 0),
            new TestCase<>("Symmetric Tree Equal Subtree Sums", symmetric, 2),
            new TestCase<>("Left Skewed Unilateral Structure", leftSkewed, 80),
            new TestCase<>("Right Skewed Unilateral Structure", rightSkewed, 80),
            new TestCase<>("Two Nodes Left Child Only", twoLeft, 10),
            new TestCase<>("Two Nodes Right Child Only", twoRight, 10),
            new TestCase<>("Balanced Tree Identical Subtree Values", balancedEqual, 0)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Tilt (DEBUG)",
            testCases,
            input -> TiltDebug.solve(input),
            false
        );
    }
}
