// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MedianOfTwoSortedArrays.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MedianOfTwoSortedArraysTest {

    static class Input {
        final int[] nums1;
        final int[] nums2;

        Input(int[] nums1, int[] nums2) {
            this.nums1 = nums1;
            this.nums2 = nums2;
        }

        @Override
        public String toString() {
            return "nums1=" + Arrays.toString(nums1) + ", nums2=" + Arrays.toString(nums2);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Double>> testCases = List.of(
            new TestCase<>(
                "Odd Total Three Elements",
                new Input(new int[]{1, 3}, new int[]{2}),
                2.0
            ),
            new TestCase<>(
                "Even Total Four Elements",
                new Input(new int[]{1, 2}, new int[]{3, 4}),
                2.5
            ),
            new TestCase<>(
                "All Zeroes Array",
                new Input(new int[]{0, 0}, new int[]{0, 0}),
                0.0
            ),
            new TestCase<>(
                "First Array Empty Second One Element",
                new Input(new int[]{}, new int[]{1}),
                1.0
            ),
            new TestCase<>(
                "Second Array Empty First One Element",
                new Input(new int[]{2}, new int[]{}),
                2.0
            ),
            new TestCase<>(
                "Single Disjoint Large Outlier",
                new Input(new int[]{100}, new int[]{1, 2, 3, 4, 5}),
                3.5
            ),
            new TestCase<>(
                "Two Disjoint Ranges Ten Elements",
                new Input(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}),
                5.5
            ),
            new TestCase<>(
                "Interleaved Values Six Elements",
                new Input(new int[]{1, 5, 9}, new int[]{2, 6, 10}),
                5.5
            ),
            new TestCase<>(
                "Negative Values Three Elements",
                new Input(new int[]{3}, new int[]{-2, -1}),
                -1.0
            ),
            new TestCase<>(
                "Interleaved Spanning Zero Four Elements",
                new Input(new int[]{1, 2}, new int[]{-1, 3}),
                1.5
            )
        );

        TestRunner<Input, Double> runner = new TestRunner<>();

        runner.runTests(
            "Median of Two Sorted Arrays",
            testCases,
            input -> MedianOfTwoSortedArrays.solve(input.nums1.clone(), input.nums2.clone()),
            true
        );
    }
}
