// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FlattenBinaryTreeToLinkedList.dsa;

import java.util.*;
import com.csrgo.util.*;

public class FlattenBinaryTreeToLinkedListTest {

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
                "Standard Six Nodes Binary Tree",
                new Input(new int[]{1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1}),
                new int[]{1, 2, 3, 4, 5, 6}
            ),
            new TestCase<>(
                "Empty Tree",
                new Input(new int[]{}),
                new int[]{}
            ),
            new TestCase<>(
                "Single Root Zero Node",
                new Input(new int[]{0, -1, -1}),
                new int[]{0}
            ),
            new TestCase<>(
                "Three Nodes Balanced Tree",
                new Input(new int[]{1, 2, -1, -1, 3, -1, -1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Left Skewed Three Nodes",
                new Input(new int[]{1, 2, 3, -1, -1, -1, -1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Right Skewed Three Nodes",
                new Input(new int[]{1, -1, 2, -1, 3, -1, -1}),
                new int[]{1, 2, 3}
            ),
            new TestCase<>(
                "Seven Nodes Perfect Binary Tree",
                new Input(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1}),
                new int[]{1, 2, 4, 5, 3, 6, 7}
            ),
            new TestCase<>(
                "Two Nodes Root And Left Child",
                new Input(new int[]{1, 2, -1, -1, -1}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Two Nodes Root And Right Child",
                new Input(new int[]{1, -1, 2, -1, -1}),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Mixed Values With Negative Root",
                new Input(new int[]{-10, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1}),
                new int[]{-10, 9, 20, 15, 7}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Flatten Binary Tree to Linked List",
            testCases,
            input -> FlattenBinaryTreeToLinkedList.solve(input.arr.clone()),
            true
        );
    }
}
