// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MorrisInorderTraversal.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MorrisInorderTraversalDebugTest {

    static class Input {
        final int[] arr;

        Input(int[] arr) {
            this.arr = arr;
        }

        @Override
        public String toString() {
            return Arrays.toString(arr);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Right Child With Left Subtree",
                new Input(new int[]{1, -1, 2, 3, -1, -1, -1}),
                new int[]{1, 3, 2}
            ),
            new TestCase<>(
                "Balanced Three Node Tree",
                new Input(new int[]{1, 2, -1, -1, 3, -1, -1}),
                new int[]{2, 1, 3}
            ),
            new TestCase<>(
                "Empty Tree",
                new Input(new int[]{}),
                new int[]{}
            ),
            new TestCase<>(
                "Single Root Node Tree",
                new Input(new int[]{1, -1, -1}),
                new int[]{1}
            ),
            new TestCase<>(
                "Left Skewed Chain Three Nodes",
                new Input(new int[]{1, 2, 3, -1, -1, -1, -1}),
                new int[]{3, 2, 1}
            ),
            new TestCase<>(
                "Right Skewed Chain Three Nodes",
                new Input(new int[]{1, -1, 2, -1, 3, -1, -1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Seven Nodes Perfect Binary Tree",
                new Input(new int[]{4, 2, 1, -1, -1, 3, -1, -1, 6, 5, -1, -1, 7, -1, -1}),
                new int[]{1, 2, 3, 4, 5, 6, 7}
            ),
            new TestCase<>(
                "Two Nodes Root And Left Child",
                new Input(new int[]{2, 1, -1, -1, -1}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Two Nodes Root And Right Child",
                new Input(new int[]{1, -1, 2, -1, -1}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Zigzag Tree Structure Five Nodes",
                new Input(new int[]{1, 2, -1, 3, -1, -1, 2, 3, -1, -1, -1}),
                new int[]{2, 3, 1, 3, 2}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Morris Inorder Traversal (Debug)",
            testCases,
            input -> MorrisInorderTraversalDebug.solve(input.arr.clone()),
            false
        );
    }
}
