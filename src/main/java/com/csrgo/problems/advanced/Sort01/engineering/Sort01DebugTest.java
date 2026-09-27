// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Sort01.engineering;

import java.util.*;
import com.csrgo.util.*;

public class Sort01DebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Eight Element Mixed Binary Array", new int[]{0, 1, 0, 1, 1, 0, 0, 1}, new int[]{0, 0, 0, 0, 1, 1, 1, 1}),
            new TestCase<>("Six Element Binary Array", new int[]{1, 1, 0, 0, 1, 0}, new int[]{0, 0, 0, 1, 1, 1}),
            new TestCase<>("Empty Array Boundary", new int[]{}, new int[]{}),
            new TestCase<>("Single Zero Element", new int[]{0}, new int[]{0}),
            new TestCase<>("Single One Element", new int[]{1}, new int[]{1}),
            new TestCase<>("All Zeros Array", new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}),
            new TestCase<>("All Ones Array", new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}),
            new TestCase<>("Already Sorted Binary Array", new int[]{0, 0, 1, 1}, new int[]{0, 0, 1, 1}),
            new TestCase<>("Reverse Sorted Binary Array", new int[]{1, 1, 1, 0, 0}, new int[]{0, 0, 1, 1, 1}),
            new TestCase<>("Alternating Binary Array", new int[]{1, 0, 1, 0, 1, 0}, new int[]{0, 0, 0, 1, 1, 1})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Sort 0 1 (DEBUG)",
            testCases,
            input -> Sort01Debug.solve(input),
            false
        );
    }
}
