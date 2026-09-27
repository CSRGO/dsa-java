// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveFirst.dsa;

import java.util.*;
import com.csrgo.util.*;

public class RemoveFirstTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Three Element Removal", new int[]{10, 20, 30}, new int[]{20, 30}),
            new TestCase<>("Single Element Leaves Empty", new int[]{5}, new int[]{}),
            new TestCase<>("Empty List Returns Empty", new int[]{}, new int[]{}),
            new TestCase<>("Two Elements Leaves One", new int[]{100, 200}, new int[]{200}),
            new TestCase<>("Negative Integers In List", new int[]{-5, -4, -3, -2}, new int[]{-4, -3, -2}),
            new TestCase<>("All Identical Elements", new int[]{7, 7, 7, 7}, new int[]{7, 7, 7}),
            new TestCase<>("Long Ascending Sequence", new int[]{1, 2, 3, 4, 5, 6}, new int[]{2, 3, 4, 5, 6}),
            new TestCase<>("Zero Initial Element", new int[]{0, 10, 20}, new int[]{10, 20}),
            new TestCase<>("Two Duplicate Elements", new int[]{42, 42}, new int[]{42}),
            new TestCase<>("Descending Numbers Sequence", new int[]{9, 8, 7, 6}, new int[]{8, 7, 6})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Remove First",
            testCases,
            input -> RemoveFirst.solve(input),
            true
        );
    }
}
