// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.QuickSort.engineering;

import java.util.*;
import com.csrgo.util.*;

public class QuickSortDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Seven Element Unsorted Sequence", new int[]{10, 80, 30, 90, 40, 50, 70}, new int[]{10, 30, 40, 50, 70, 80, 90}),
            new TestCase<>("Five Element Permutation", new int[]{4, 1, 3, 9, 7}, new int[]{1, 3, 4, 7, 9}),
            new TestCase<>("Empty Array Boundary", new int[]{}, new int[]{}),
            new TestCase<>("Single Item Array", new int[]{73}, new int[]{73}),
            new TestCase<>("Already Sorted Array", new int[]{2, 4, 6, 8, 10}, new int[]{2, 4, 6, 8, 10}),
            new TestCase<>("Reverse Ordered Array", new int[]{10, 8, 6, 4, 2}, new int[]{2, 4, 6, 8, 10}),
            new TestCase<>("Negative Integers And Zero", new int[]{-12, 5, 0, -3, 8}, new int[]{-12, -3, 0, 5, 8}),
            new TestCase<>("Duplicate Values In Array", new int[]{3, 1, 3, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 3}),
            new TestCase<>("All Identical Elements", new int[]{5, 5, 5, 5, 5}, new int[]{5, 5, 5, 5, 5}),
            new TestCase<>("Two Elements Inversion", new int[]{99, 12}, new int[]{12, 99})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Quick Sort (DEBUG)",
            testCases,
            input -> QuickSortDebug.solve(input),
            false
        );
    }
}
