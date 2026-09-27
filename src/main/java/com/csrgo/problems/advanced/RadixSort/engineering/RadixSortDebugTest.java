// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RadixSort.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RadixSortDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Eight Element Mixed Lengths", new int[]{170, 45, 75, 90, 802, 24, 2, 66}, new int[]{2, 24, 45, 66, 75, 90, 170, 802}),
            new TestCase<>("Seven Three Digit Numbers", new int[]{329, 457, 657, 839, 436, 720, 355}, new int[]{329, 355, 436, 457, 657, 720, 839}),
            new TestCase<>("Empty Array Boundary", new int[]{}, new int[]{}),
            new TestCase<>("Single Value Array", new int[]{505}, new int[]{505}),
            new TestCase<>("Already Sorted Array", new int[]{10, 20, 30, 40, 50}, new int[]{10, 20, 30, 40, 50}),
            new TestCase<>("Reverse Sorted Array", new int[]{900, 800, 700, 600}, new int[]{600, 700, 800, 900}),
            new TestCase<>("Array With Zero Included", new int[]{0, 40, 100, 5, 20}, new int[]{0, 5, 20, 40, 100}),
            new TestCase<>("Duplicate Elements Array", new int[]{42, 11, 42, 99, 11}, new int[]{11, 11, 42, 42, 99}),
            new TestCase<>("All Identical Elements", new int[]{777, 777, 777}, new int[]{777, 777, 777}),
            new TestCase<>("Large Value Disparity", new int[]{100000, 1, 1000, 10, 100}, new int[]{1, 10, 100, 1000, 100000})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Radix Sort (DEBUG)",
            testCases,
            input -> RadixSortDebug.solve(input),
            false
        );
    }
}
