// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ReverseDataIterative.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ReverseDataIterativeDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Five Element Odd Length", new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}),
            new TestCase<>("Two Element Even Length", new int[]{10, 20}, new int[]{20, 10}),
            new TestCase<>("Single Element List", new int[]{42}, new int[]{42}),
            new TestCase<>("Empty List Reversal", new int[]{}, new int[]{}),
            new TestCase<>("Four Element Even Length", new int[]{10, 20, 30, 40}, new int[]{40, 30, 20, 10}),
            new TestCase<>("Negative Elements List", new int[]{-5, -2, -8, -1}, new int[]{-1, -8, -2, -5}),
            new TestCase<>("Already Symmetric Palindrome", new int[]{1, 2, 3, 2, 1}, new int[]{1, 2, 3, 2, 1}),
            new TestCase<>("All Identical Elements", new int[]{9, 9, 9, 9}, new int[]{9, 9, 9, 9}),
            new TestCase<>("Zero Elements Present", new int[]{0, 5, 0}, new int[]{0, 5, 0}),
            new TestCase<>("Long Sequence Reverse", new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{8, 7, 6, 5, 4, 3, 2, 1})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Reverse Data Iterative (DEBUG)",
            testCases,
            input -> ReverseDataIterativeDebug.solve(input),
            false
        );
    }
}
