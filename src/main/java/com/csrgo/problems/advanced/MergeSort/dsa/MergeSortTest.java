// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeSort.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MergeSortTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Seven Element Array", new int[]{38, 27, 43, 3, 9, 82, 10}, new int[]{3, 9, 10, 27, 38, 43, 82}),
            new TestCase<>("Array With Negative And Zero", new int[]{10, -1, 2, 5, 0, 6, 4}, new int[]{-1, 0, 2, 4, 5, 6, 10}),
            new TestCase<>("Empty Array Boundary", new int[]{}, new int[]{}),
            new TestCase<>("Single Element Array", new int[]{88}, new int[]{88}),
            new TestCase<>("Already Sorted Ascending Array", new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
            new TestCase<>("Completely Reversed Array", new int[]{6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6}),
            new TestCase<>("Array With Duplicates", new int[]{5, 2, 8, 5, 2, 8, 1}, new int[]{1, 2, 2, 5, 5, 8, 8}),
            new TestCase<>("All Identical Elements", new int[]{4, 4, 4, 4}, new int[]{4, 4, 4, 4}),
            new TestCase<>("Two Elements Inversion", new int[]{55, 11}, new int[]{11, 55}),
            new TestCase<>("Large Odd Length Sequence", new int[]{100, -50, 400, 0, -200, 50, 300}, new int[]{-200, -50, 0, 50, 100, 300, 400})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Merge Sort",
            testCases,
            input -> MergeSort.solve(input),
            true
        );
    }
}
