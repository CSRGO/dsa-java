// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ReversePointerIterative.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ReversePointerIterativeDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Five Element Sequence", new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}),
            new TestCase<>("Two Element Sequence", new int[]{1, 2}, new int[]{2, 1}),
            new TestCase<>("Single Element List", new int[]{42}, new int[]{42}),
            new TestCase<>("Empty List Reversal", new int[]{}, new int[]{}),
            new TestCase<>("Four Element Sequence", new int[]{10, 20, 30, 40}, new int[]{40, 30, 20, 10}),
            new TestCase<>("Negative Integers List", new int[]{-10, -20, -30}, new int[]{-30, -20, -10}),
            new TestCase<>("All Identical Elements", new int[]{5, 5, 5, 5}, new int[]{5, 5, 5, 5}),
            new TestCase<>("Three Elements With Zero", new int[]{0, 1, 0}, new int[]{0, 1, 0}),
            new TestCase<>("Long Ascending Sequence", new int[]{2, 4, 6, 8, 10, 12}, new int[]{12, 10, 8, 6, 4, 2}),
            new TestCase<>("Descending Numbers Sequence", new int[]{9, 7, 5, 3, 1}, new int[]{1, 3, 5, 7, 9})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Reverse Pointer Iterative (DEBUG)",
            testCases,
            input -> ReversePointerIterativeDebug.solve(input),
            false
        );
    }
}
