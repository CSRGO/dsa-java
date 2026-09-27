// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddNodeBST.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AddNodeBSTDebugTest {

    static class Input {
        final int[] arr;
        final int val;

        Input(int[] arr, int val) {
            this.arr = arr;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] standardTree = {4, 2, 1, -1, -1, 3, -1, -1, 7, -1, -1};
        int[] threeNodeTree = {4, 2, -1, -1, 7, -1, -1};
        int[] singleNode = {10, -1, -1};
        int[] leftSkewed = {30, 20, 10, -1, -1, -1, -1};
        int[] rightSkewed = {10, -1, 20, -1, 30, -1, -1};
        int[] twoNodeLeft = {30, 10, -1, -1, -1};
        int[] twoNodeRight = {10, -1, 30, -1, -1};

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Insert into Middle Level Leaf", new Input(standardTree, 5), new int[]{4, 2, 1, 3, 7, 5}),
            new TestCase<>("Insert into Empty Tree Initializer", new Input(new int[]{}, 5), new int[]{5}),
            new TestCase<>("Insert Minimum Value Traversing Leftmost", new Input(threeNodeTree, 1), new int[]{4, 2, 1, 7}),
            new TestCase<>("Insert Maximum Value Traversing Rightmost", new Input(threeNodeTree, 9), new int[]{4, 2, 7, 9}),
            new TestCase<>("Single Node Tree Insert Left Child", new Input(singleNode, 5), new int[]{10, 5}),
            new TestCase<>("Single Node Tree Insert Right Child", new Input(singleNode, 15), new int[]{10, 15}),
            new TestCase<>("Left Skewed Chain Appending Minimum", new Input(leftSkewed, 5), new int[]{30, 20, 10, 5}),
            new TestCase<>("Right Skewed Chain Appending Maximum", new Input(rightSkewed, 40), new int[]{10, 20, 30, 40}),
            new TestCase<>("Two Node Tree Right Child of Left Leaf", new Input(twoNodeLeft, 20), new int[]{30, 10, 20}),
            new TestCase<>("Two Node Tree Left Child of Right Leaf", new Input(twoNodeRight, 20), new int[]{10, 30, 20})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Add Node (BST) (DEBUG)",
            testCases,
            input -> AddNodeBSTDebug.solve(input.arr, input.val),
            false
        );
    }
}
