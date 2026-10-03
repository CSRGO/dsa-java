// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReduceArraySizeToHalf.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ReduceArraySizeToHalfTest {

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

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Classic Ten Elements Mixed Frequencies",
                new Input(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}),
                2
            ),
            new TestCase<>(
                "All Identical Elements",
                new Input(new int[]{7, 7, 7, 7, 7, 7}),
                1
            ),
            new TestCase<>(
                "Two Distinct Elements Pair",
                new Input(new int[]{1, 9}),
                1
            ),
            new TestCase<>(
                "Four Elements Dominant Pair",
                new Input(new int[]{1000, 1000, 3, 7}),
                1
            ),
            new TestCase<>(
                "Ten Unique Elements Each Occurring Once",
                new Input(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                5
            ),
            new TestCase<>(
                "Eight Elements Uniform Pairs",
                new Input(new int[]{1, 1, 2, 2, 3, 3, 4, 4}),
                2
            ),
            new TestCase<>(
                "Six Elements One Dominant Triple",
                new Input(new int[]{5, 5, 5, 1, 2, 3}),
                1
            ),
            new TestCase<>(
                "Nine Elements Two Large Frequencies",
                new Input(new int[]{9, 4, 1, 4, 1, 4, 9, 9, 9}),
                2
            ),
            new TestCase<>(
                "Eight Elements Single Major Group",
                new Input(new int[]{4, 4, 4, 4, 1, 2, 3, 5}),
                1
            ),
            new TestCase<>(
                "Six Distinct Elements Single Frequencies",
                new Input(new int[]{10, 20, 30, 40, 50, 60}),
                3
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Reduce Array Size to Half",
            testCases,
            input -> ReduceArraySizeToHalf.solve(input.arr.clone()),
            true
        );
    }
}
