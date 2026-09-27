// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BubbleSort.engineering;

import java.util.*;
import com.csrgo.util.*;

public class BubbleSortDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Seven Element Array", new int[]{64, 34, 25, 12, 22, 11, 90}, new int[]{11, 12, 22, 25, 34, 64, 90}),
            new TestCase<>("Standard Five Element Array", new int[]{5, 1, 4, 2, 8}, new int[]{1, 2, 4, 5, 8}),
            new TestCase<>("Empty Array Input", new int[]{}, new int[]{}),
            new TestCase<>("Single Element Array", new int[]{42}, new int[]{42}),
            new TestCase<>("Already Sorted Array", new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Reverse Sorted Array", new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Negative Integers In Array", new int[]{-3, 10, -5, 0, 7}, new int[]{-5, -3, 0, 7, 10}),
            new TestCase<>("Duplicate Elements Array", new int[]{3, 1, 2, 3, 1}, new int[]{1, 1, 2, 3, 3}),
            new TestCase<>("All Identical Elements", new int[]{9, 9, 9, 9}, new int[]{9, 9, 9, 9}),
            new TestCase<>("Two Elements Inversion", new int[]{2, 1}, new int[]{1, 2})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Bubble Sort (DEBUG)",
            testCases,
            input -> BubbleSortDebug.solve(input),
            false
        );
    }
}
