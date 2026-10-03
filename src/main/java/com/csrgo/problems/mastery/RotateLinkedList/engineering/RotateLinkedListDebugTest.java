// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RotateLinkedList.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RotateLinkedListDebugTest {

    static class Input {
        final int[] arr;
        final int k;

        Input(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
        }

        @Override
        public String toString() {
            return "arr=" + Arrays.toString(arr) + ", k=" + k;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Standard Five Element List Rotation",
                new Input(new int[]{1, 2, 3, 4, 5}, 2),
                new int[]{4, 5, 1, 2, 3}
            ),
            new TestCase<>(
                "Rotation Exceeding List Length Modulo Needed",
                new Input(new int[]{0, 1, 2}, 4),
                new int[]{2, 0, 1}
            ),
            new TestCase<>(
                "Zero Rotation Returns Unmodified List",
                new Input(new int[]{1, 2}, 0),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Two Element List Rotated By One",
                new Input(new int[]{1, 2}, 1),
                new int[]{2, 1}
            ),
            new TestCase<>(
                "Rotation Equal To List Length",
                new Input(new int[]{1, 2}, 2),
                new int[]{1, 2}
            ),
            new TestCase<>(
                "Empty List Handling",
                new Input(new int[]{}, 3),
                new int[]{}
            ),
            new TestCase<>(
                "Single Node List Large K",
                new Input(new int[]{99}, 100),
                new int[]{99}
            ),
            new TestCase<>(
                "Four Elements Rotated By Six",
                new Input(new int[]{10, 20, 30, 40}, 6),
                new int[]{30, 40, 10, 20}
            ),
            new TestCase<>(
                "Seven Elements Rotation",
                new Input(new int[]{1, 2, 3, 4, 5, 6, 7}, 3),
                new int[]{5, 6, 7, 1, 2, 3, 4}
            ),
            new TestCase<>(
                "Large Value Of K Two Billion",
                new Input(new int[]{1, 2, 3}, 2000000000),
                new int[]{2, 3, 1}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Rotate Linked List (DEBUG)",
            testCases,
            input -> RotateLinkedListDebug.solve(input.arr.clone(), input.k),
            false
        );
    }
}
