// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveLast.engineering;

import java.util.*;
import com.csrgo.util.*;

public class RemoveLastDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Three Element Removal", new int[]{10, 20, 30}, new int[]{10, 20}),
            new TestCase<>("Single Element Leaves Empty", new int[]{42}, new int[]{}),
            new TestCase<>("Empty List Returns Empty", new int[]{}, new int[]{}),
            new TestCase<>("Two Elements Leaves Head", new int[]{100, 200}, new int[]{100}),
            new TestCase<>("Negative Integers In List", new int[]{-5, -4, -3, -2}, new int[]{-5, -4, -3}),
            new TestCase<>("All Identical Elements", new int[]{7, 7, 7, 7}, new int[]{7, 7, 7}),
            new TestCase<>("Long Sequence Tail Removal", new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5}),
            new TestCase<>("Zero Ending Element", new int[]{10, 20, 0}, new int[]{10, 20}),
            new TestCase<>("Two Duplicate Elements", new int[]{99, 99}, new int[]{99}),
            new TestCase<>("Descending Numbers Sequence", new int[]{9, 8, 7, 6}, new int[]{9, 8, 7})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Remove Last (DEBUG)",
            testCases,
            input -> RemoveLastDebug.solve(input),
            false
        );
    }
}
