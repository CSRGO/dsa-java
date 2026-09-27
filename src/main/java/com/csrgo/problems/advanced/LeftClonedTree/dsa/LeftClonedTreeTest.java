// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LeftClonedTree.dsa;

import java.util.*;
import com.csrgo.util.*;

public class LeftClonedTreeTest {

    public static void main(String[] args) {
        int[] standardTree = {50, 25, -1, -1, 75, -1, -1};
        int[] fullTree = {50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] emptyTree = {};
        int[] leftSkewed = {10, 20, 30, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] onlyLeft = {1, 2, -1, -1, -1};
        int[] onlyRight = {1, -1, 2, -1, -1};
        int[] zigzagTree = {10, 20, -1, 30, -1, -1, -1};
        int[] fourNodeTree = {100, 50, -1, -1, 150, 120, -1, -1, -1};

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Balanced Three Node Tree", standardTree, new int[]{50, 50, 25, 25, 75, 75}),
            new TestCase<>("Full Binary Tree of Seven Nodes", fullTree, new int[]{50, 50, 25, 25, 12, 12, 37, 37, 75, 75, 62, 62, 87, 87}),
            new TestCase<>("Single Node Tree", singleNode, new int[]{10, 10}),
            new TestCase<>("Empty Tree Bounds", emptyTree, new int[]{}),
            new TestCase<>("Left Skewed Unilateral Tree", leftSkewed, new int[]{10, 10, 20, 20, 30, 30}),
            new TestCase<>("Right Skewed Unilateral Tree", rightSkewed, new int[]{10, 10, 20, 20, 30, 30}),
            new TestCase<>("Root with Only Left Child", onlyLeft, new int[]{1, 1, 2, 2}),
            new TestCase<>("Root with Only Right Child", onlyRight, new int[]{1, 1, 2, 2}),
            new TestCase<>("Zigzag Left-Right Structure", zigzagTree, new int[]{10, 10, 20, 20, 30, 30}),
            new TestCase<>("Four Node Asymmetric Tree", fourNodeTree, new int[]{100, 100, 50, 50, 150, 150, 120, 120})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Left Cloned Tree",
            testCases,
            input -> LeftClonedTree.solve(input),
            true
        );
    }
}
