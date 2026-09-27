// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CountSort.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CountSortDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Fifteen Element Array Multiple Duplicates", new int[]{9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9}, new int[]{3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 8, 9, 9, 9, 9}),
            new TestCase<>("Seven Element Distinct Sequence", new int[]{4, 2, 2, 8, 3, 3, 1}, new int[]{1, 2, 2, 3, 3, 4, 8}),
            new TestCase<>("Empty Array Boundary", new int[]{}, new int[]{}),
            new TestCase<>("Single Item Array", new int[]{15}, new int[]{15}),
            new TestCase<>("Already Sorted Array", new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Reverse Ordered Array", new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Negative Integers Included", new int[]{-3, 2, -1, 5, -3, 0}, new int[]{-3, -3, -1, 0, 2, 5}),
            new TestCase<>("All Identical Elements Array", new int[]{8, 8, 8, 8}, new int[]{8, 8, 8, 8}),
            new TestCase<>("Two Elements Inversion", new int[]{10, -5}, new int[]{-5, 10}),
            new TestCase<>("Binary Values Only", new int[]{1, 0, 1, 1, 0, 0, 1}, new int[]{0, 0, 0, 1, 1, 1, 1})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Count Sort (DEBUG)",
            testCases,
            input -> CountSortDebug.solve(input),
            false
        );
    }
}
