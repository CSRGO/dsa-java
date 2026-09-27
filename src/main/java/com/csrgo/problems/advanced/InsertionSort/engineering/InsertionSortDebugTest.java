// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.InsertionSort.engineering;

import java.util.*;
import com.csrgo.util.*;

public class InsertionSortDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Five Element Classic Array", new int[]{12, 11, 13, 5, 6}, new int[]{5, 6, 11, 12, 13}),
            new TestCase<>("Array With Duplicate Elements", new int[]{31, 41, 59, 26, 41, 58}, new int[]{26, 31, 41, 41, 58, 59}),
            new TestCase<>("Empty Array Boundary", new int[]{}, new int[]{}),
            new TestCase<>("Single Item Array", new int[]{50}, new int[]{50}),
            new TestCase<>("Already Sorted Array", new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Completely Reversed Array", new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Array With Negative Values", new int[]{-7, 14, 0, -2, 8}, new int[]{-7, -2, 0, 8, 14}),
            new TestCase<>("All Identical Values Array", new int[]{3, 3, 3, 3}, new int[]{3, 3, 3, 3}),
            new TestCase<>("Two Elements Inversion", new int[]{20, 10}, new int[]{10, 20}),
            new TestCase<>("Alternating High Low Array", new int[]{10, 1, 9, 2, 8, 3}, new int[]{1, 2, 3, 8, 9, 10})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Insertion Sort (DEBUG)",
            testCases,
            input -> InsertionSortDebug.solve(input),
            false
        );
    }
}
