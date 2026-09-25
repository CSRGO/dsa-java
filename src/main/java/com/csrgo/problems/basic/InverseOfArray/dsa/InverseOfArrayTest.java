// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InverseOfArray.dsa;

import java.util.*;
import com.csrgo.util.*;

public class InverseOfArrayTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Five Elements Standard", new int[]{3, 4, 1, 2, 0}, new int[]{4, 2, 3, 0, 1}),
            new TestCase<>("Identity Four Elements", new int[]{0, 1, 2, 3}, new int[]{0, 1, 2, 3}),
            new TestCase<>("Single Element", new int[]{0}, new int[]{0}),
            new TestCase<>("Two Elements Swap", new int[]{1, 0}, new int[]{1, 0}),
            new TestCase<>("Three Elements Cycle", new int[]{2, 0, 1}, new int[]{1, 2, 0}),
            new TestCase<>("Five Elements Self Inverse", new int[]{4, 3, 2, 1, 0}, new int[]{4, 3, 2, 1, 0}),
            new TestCase<>("Left Shift Cycle", new int[]{1, 2, 3, 4, 0}, new int[]{4, 0, 1, 2, 3}),
            new TestCase<>("Right Shift Cycle", new int[]{4, 0, 1, 2, 3}, new int[]{1, 2, 3, 4, 0}),
            new TestCase<>("Six Elements Self Inverse", new int[]{5, 4, 3, 2, 1, 0}, new int[]{5, 4, 3, 2, 1, 0}),
            new TestCase<>("Six Elements Double Cycle", new int[]{2, 3, 4, 5, 0, 1}, new int[]{4, 5, 0, 1, 2, 3})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Inverse of Array",
            testCases,
            input -> InverseOfArray.solve(input.clone()), 
            true 
        );
    }
}
