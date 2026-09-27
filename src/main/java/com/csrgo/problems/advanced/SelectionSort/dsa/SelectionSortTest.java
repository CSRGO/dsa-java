// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SelectionSort.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SelectionSortTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Five Element Unsorted Array", new int[]{64, 25, 12, 22, 11}, new int[]{11, 12, 22, 25, 64}),
            new TestCase<>("Arbitrary Five Element Sequence", new int[]{29, 10, 14, 37, 13}, new int[]{10, 13, 14, 29, 37}),
            new TestCase<>("Empty Array Input", new int[]{}, new int[]{}),
            new TestCase<>("Single Element Array", new int[]{99}, new int[]{99}),
            new TestCase<>("Already Sorted Array", new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Reverse Ordered Array", new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Negative Integers Included", new int[]{-8, 12, -15, 0, 4}, new int[]{-15, -8, 0, 4, 12}),
            new TestCase<>("Duplicate Values In Array", new int[]{4, 2, 4, 1, 2}, new int[]{1, 2, 2, 4, 4}),
            new TestCase<>("All Identical Elements", new int[]{7, 7, 7, 7}, new int[]{7, 7, 7, 7}),
            new TestCase<>("Two Elements Inversion", new int[]{9, 3}, new int[]{3, 9})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Selection Sort",
            testCases,
            input -> SelectionSort.solve(input),
            true
        );
    }
}
