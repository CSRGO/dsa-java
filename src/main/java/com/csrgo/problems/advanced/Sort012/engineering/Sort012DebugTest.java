// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Sort012.engineering;

import java.util.*;
import com.csrgo.util.*;

public class Sort012DebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Six Element Mixed Array", new int[]{2, 0, 2, 1, 1, 0}, new int[]{0, 0, 1, 1, 2, 2}),
            new TestCase<>("Three Distinct Elements", new int[]{2, 0, 1}, new int[]{0, 1, 2}),
            new TestCase<>("Empty Array Boundary", new int[]{}, new int[]{}),
            new TestCase<>("Single Zero Element", new int[]{0}, new int[]{0}),
            new TestCase<>("Single Two Element", new int[]{2}, new int[]{2}),
            new TestCase<>("Already Sorted Array", new int[]{0, 0, 1, 1, 2, 2}, new int[]{0, 0, 1, 1, 2, 2}),
            new TestCase<>("Reverse Ordered Array", new int[]{2, 2, 1, 1, 0, 0}, new int[]{0, 0, 1, 1, 2, 2}),
            new TestCase<>("All Identical Elements Array", new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}),
            new TestCase<>("Only Zeros And Twos", new int[]{2, 0, 2, 0, 0, 2}, new int[]{0, 0, 0, 2, 2, 2}),
            new TestCase<>("Only Ones And Twos", new int[]{2, 1, 2, 1, 1, 2}, new int[]{1, 1, 1, 2, 2, 2})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Sort 0 1 2 (DEBUG)",
            testCases,
            input -> Sort012Debug.solve(input),
            false
        );
    }
}
