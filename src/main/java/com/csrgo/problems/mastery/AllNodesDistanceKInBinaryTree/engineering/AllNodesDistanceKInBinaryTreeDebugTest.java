// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.AllNodesDistanceKInBinaryTree.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AllNodesDistanceKInBinaryTreeDebugTest {

    static class Input {
        final int[] arr;
        final int target;
        final int k;

        Input(int[] arr, int target, int k) {
            this.arr = arr;
            this.target = target;
            this.k = k;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", target=" + target + ", k=" + k;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard LeetCode Example Distance Two",
                new Input(new int[]{3, 5, 6, -1, -1, 2, 7, -1, -1, 4, -1, -1, 1, 0, -1, -1, 8, -1, -1}, 5, 2),
                new int[]{1, 4, 7}
            ),
            new TestCase<>(
                "Single Node Distance Beyond Bounds",
                new Input(new int[]{1, -1, -1}, 1, 3),
                new int[]{}
            ),
            new TestCase<>(
                "Immediate Children Distance One",
                new Input(new int[]{1, 2, -1, -1, 3, -1, -1}, 1, 1),
                new int[]{2, 3}
            ),
            new TestCase<>(
                "From Left Child To Parent Distance One",
                new Input(new int[]{1, 2, -1, -1, 3, -1, -1}, 2, 1),
                new int[]{1}
            ),
            new TestCase<>(
                "From Left Child To Sibling Distance Two",
                new Input(new int[]{1, 2, -1, -1, 3, -1, -1}, 2, 2),
                new int[]{3}
            ),
            new TestCase<>(
                "Distance Zero Returns Target Node",
                new Input(new int[]{1, 2, 3, -1, -1, -1, -1}, 1, 0),
                new int[]{1}
            ),
            new TestCase<>(
                "From Leaf Upward To Ancestor Distance Two",
                new Input(new int[]{1, 2, 3, -1, -1, -1, -1}, 3, 2),
                new int[]{1}
            ),
            new TestCase<>(
                "Perfect Tree Subtree Nodes And Parent",
                new Input(new int[]{4, 2, 1, -1, -1, 3, -1, -1, 6, 5, -1, -1, 7, -1, -1}, 2, 1),
                new int[]{1, 3, 4}
            ),
            new TestCase<>(
                "Cross Subtree Sibling Level Distance Two",
                new Input(new int[]{4, 2, 1, -1, -1, 3, -1, -1, 6, 5, -1, -1, 7, -1, -1}, 2, 2),
                new int[]{6}
            ),
            new TestCase<>(
                "Distance Exceeding Tree Diameter",
                new Input(new int[]{10, 5, -1, -1, 20, -1, -1}, 5, 3),
                new int[]{}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "All Nodes Distance K in Binary Tree (Debug)",
            testCases,
            input -> AllNodesDistanceKInBinaryTreeDebug.solve(input.arr.clone(), input.target, input.k),
            false
        );
    }
}
