// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DeleteMiddleNodeOfLinkedList.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DeleteMiddleNodeOfLinkedListTest {

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
                "Odd Number Of Seven Elements",
                new Input(new int[]{1, 3, 4, 7, 1, 2, 6}),
                new int[]{1, 3, 4, 1, 2, 6}
            ),
            new TestCase<>(
                "Even Number Of Four Elements",
                new Input(new int[]{1, 2, 3, 4}),
                new int[]{1, 2, 4}
            ),
            new TestCase<>(
                "Two Elements Deletes Second Element",
                new Input(new int[]{2, 1}),
                new int[]{2}
            ),
            new TestCase<>(
                "Single Element Deletes And Returns Empty",
                new Input(new int[]{42}),
                new int[]{}
            ),
            new TestCase<>(
                "Three Elements Deletes Middle Index One",
                new Input(new int[]{10, 20, 30}),
                new int[]{10, 30}
            ),
            new TestCase<>(
                "Five Elements Deletes Index Two",
                new Input(new int[]{5, 10, 15, 20, 25}),
                new int[]{5, 10, 20, 25}
            ),
            new TestCase<>(
                "Six Elements Even Deletes Index Three",
                new Input(new int[]{1, 2, 3, 4, 5, 6}),
                new int[]{1, 2, 3, 5, 6}
            ),
            new TestCase<>(
                "Duplicate Elements In Linked List",
                new Input(new int[]{7, 7, 7, 7, 7}),
                new int[]{7, 7, 7, 7}
            ),
            new TestCase<>(
                "Negative Numbers List",
                new Input(new int[]{-5, -4, -3, -2}),
                new int[]{-5, -4, -2}
            ),
            new TestCase<>(
                "Large Ten Element Array",
                new Input(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}),
                new int[]{0, 1, 2, 3, 4, 6, 7, 8, 9}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Delete Middle Node of Linked List",
            testCases,
            input -> DeleteMiddleNodeOfLinkedList.solve(input.arr.clone()),
            true
        );
    }
}
