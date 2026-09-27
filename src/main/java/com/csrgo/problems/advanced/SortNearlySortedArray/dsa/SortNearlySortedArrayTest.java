// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SortNearlySortedArray.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SortNearlySortedArrayTest {

    static class Input {
        final int[] arr;
        final int k;

        Input(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Classic Six Elements K Three", new Input(new int[]{2, 6, 3, 12, 56, 8}, 3), new int[]{2, 3, 6, 8, 12, 56}),
            new TestCase<>("Standard Seven Elements K Three", new Input(new int[]{6, 5, 3, 2, 8, 10, 9}, 3), new int[]{2, 3, 5, 6, 8, 9, 10}),
            new TestCase<>("Already Sorted Array K Zero", new Input(new int[]{1, 2, 3, 4, 5}, 0), new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Single Element Array", new Input(new int[]{10}, 0), new int[]{10}),
            new TestCase<>("Two Elements Swapped K One", new Input(new int[]{2, 1}, 1), new int[]{1, 2}),
            new TestCase<>("Negative Numbers Nearly Sorted", new Input(new int[]{-3, -5, -1, 4, 2}, 2), new int[]{-5, -3, -1, 2, 4}),
            new TestCase<>("Duplicates Across Sliding Window", new Input(new int[]{4, 4, 2, 2, 8, 7}, 2), new int[]{2, 2, 4, 4, 7, 8}),
            new TestCase<>("All Identical Values Array", new Input(new int[]{5, 5, 5, 5}, 1), new int[]{5, 5, 5, 5}),
            new TestCase<>("Zero Dispersed In Range", new Input(new int[]{1, 0, 3, 2}, 1), new int[]{0, 1, 2, 3}),
            new TestCase<>("Max Window Span Full Array Length", new Input(new int[]{10, 9, 8, 7}, 3), new int[]{7, 8, 9, 10})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Sort Nearly Sorted Array",
            testCases,
            input -> SortNearlySortedArray.solve(input.arr, input.k),
            true
        );
    }
}
