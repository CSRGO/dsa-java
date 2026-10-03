// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConstructBinaryTreeFromInorderAndPostorder.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ConstructBinaryTreeFromInorderAndPostorderTest {

    static class Input {
        final int[] inorder;
        final int[] postorder;

        Input(int[] inorder, int[] postorder) {
            this.inorder = inorder;
            this.postorder = postorder;
        }

        @Override
        public String toString() {
            return "inorder=" + Arrays.toString(inorder) + ", postorder=" + Arrays.toString(postorder);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Five Nodes Binary Tree",
                new Input(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}),
                new int[]{3, 9, 20, 15, 7}
            ),
            new TestCase<>(
                "Single Node Binary Tree",
                new Input(new int[]{-1}, new int[]{-1}),
                new int[]{-1}
            ),
            new TestCase<>(
                "Three Nodes Balanced Tree",
                new Input(new int[]{2, 1, 3}, new int[]{2, 3, 1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Left Skewed Three Nodes",
                new Input(new int[]{3, 2, 1}, new int[]{3, 2, 1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Right Skewed Three Nodes",
                new Input(new int[]{1, 2, 3}, new int[]{3, 2, 1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Perfect Binary Tree Seven Nodes",
                new Input(new int[]{4, 2, 5, 1, 6, 3, 7}, new int[]{4, 5, 2, 6, 7, 3, 1}),
                new int[]{1, 2, 4, 5, 3, 6, 7}
            ),
            new TestCase<>(
                "Two Nodes Root And Left Child",
                new Input(new int[]{2, 1}, new int[]{2, 1}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Two Nodes Root And Right Child",
                new Input(new int[]{1, 2}, new int[]{2, 1}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Zigzag Tree Configuration",
                new Input(new int[]{1, 3, 2}, new int[]{3, 2, 1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Binary Search Tree Ordering Five Nodes",
                new Input(new int[]{1, 5, 7, 10, 15}, new int[]{1, 7, 5, 15, 10}),
                new int[]{10, 5, 1, 7, 15}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Construct Binary Tree from Inorder and Postorder",
            testCases,
            input -> ConstructBinaryTreeFromInorderAndPostorder.solve(input.inorder.clone(), input.postorder.clone()),
            true
        );
    }
}
