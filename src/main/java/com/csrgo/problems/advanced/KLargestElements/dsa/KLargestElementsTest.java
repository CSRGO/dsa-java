// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KLargestElements.dsa;

import java.util.*;
import com.csrgo.util.*;

public class KLargestElementsTest {

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
            new TestCase<>("Classic Eleven Element Array K Four", new Input(new int[]{13, 12, 11, 5, 2, 7, 8, 9, 3, 4, 10}, 4), new int[]{10, 11, 12, 13}),
            new TestCase<>("Standard Six Element Array K Two", new Input(new int[]{3, 2, 1, 5, 6, 4}, 2), new int[]{5, 6}),
            new TestCase<>("K Equals Entire Array Length", new Input(new int[]{5, 1, 3}, 3), new int[]{1, 3, 5}),
            new TestCase<>("Single Element Array K Equals One", new Input(new int[]{10}, 1), new int[]{10}),
            new TestCase<>("All Identical Values In Array", new Input(new int[]{7, 7, 7, 7}, 2), new int[]{7, 7}),
            new TestCase<>("Negative Numbers Selection", new Input(new int[]{-10, -50, -20, -5, -1}, 3), new int[]{-10, -5, -1}),
            new TestCase<>("Already Sorted Ascending Input", new Input(new int[]{1, 2, 3, 4, 5}, 3), new int[]{3, 4, 5}),
            new TestCase<>("Already Sorted Descending Input", new Input(new int[]{5, 4, 3, 2, 1}, 2), new int[]{4, 5}),
            new TestCase<>("Array With Zeroes and Duplicates", new Input(new int[]{0, 0, 5, 5, 2, 1}, 3), new int[]{2, 5, 5}),
            new TestCase<>("K Equals One Extract Maximum", new Input(new int[]{19, 4, 88, 3, 45}, 1), new int[]{88})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "K Largest Elements",
            testCases,
            input -> KLargestElements.solve(input.arr, input.k),
            true
        );
    }
}
