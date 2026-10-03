// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConstructBinaryTreeFromPreorderAndInorder.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ConstructBinaryTreeFromPreorderAndInorderTest {

    static class Input {
        final int[] preorder;
        final int[] inorder;

        Input(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            this.inorder = inorder;
        }

        @Override
        public String toString() {
            return "preorder=" + Arrays.toString(preorder) + ", inorder=" + Arrays.toString(inorder);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Five Nodes Binary Tree",
                new Input(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}),
                new int[]{9, 15, 7, 20, 3}
            ),
            new TestCase<>(
                "Single Node Binary Tree",
                new Input(new int[]{-1}, new int[]{-1}),
                new int[]{-1}
            ),
            new TestCase<>(
                "Three Nodes Balanced Tree",
                new Input(new int[]{1, 2, 3}, new int[]{2, 1, 3}),
                new int[]{2, 3, 1}
            ),
            new TestCase<>(
                "Left Skewed Three Nodes",
                new Input(new int[]{1, 2, 3}, new int[]{3, 2, 1}),
                new int[]{3, 2, 1}
            ),
            new TestCase<>(
                "Right Skewed Three Nodes",
                new Input(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                new int[]{3, 2, 1}
            ),
            new TestCase<>(
                "Perfect Binary Tree Seven Nodes",
                new Input(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 2, 5, 1, 6, 3, 7}),
                new int[]{4, 5, 2, 6, 7, 3, 1}
            ),
            new TestCase<>(
                "Two Nodes Root And Left Child",
                new Input(new int[]{1, 2}, new int[]{2, 1}),
                new int[]{2, 1}
            ),
            new TestCase<>(
                "Two Nodes Root And Right Child",
                new Input(new int[]{1, 2}, new int[]{1, 2}),
                new int[]{2, 1}
            ),
            new TestCase<>(
                "Zigzag Tree Configuration",
                new Input(new int[]{1, 2, 3}, new int[]{1, 3, 2}),
                new int[]{3, 2, 1}
            ),
            new TestCase<>(
                "Binary Search Tree Ordering Five Nodes",
                new Input(new int[]{10, 5, 1, 7, 15}, new int[]{1, 5, 7, 10, 15}),
                new int[]{1, 7, 5, 15, 10}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Construct Binary Tree from Preorder and Inorder",
            testCases,
            input -> ConstructBinaryTreeFromPreorderAndInorder.solve(input.preorder.clone(), input.inorder.clone()),
            true
        );
    }
}
