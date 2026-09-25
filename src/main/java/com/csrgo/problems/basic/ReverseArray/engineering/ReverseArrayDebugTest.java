// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ReverseArray.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ReverseArrayDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Odd Length Array", new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}),
            new TestCase<>("Even Length Array", new int[]{10, 20, 30, 40}, new int[]{40, 30, 20, 10}),
            new TestCase<>("Single Element", new int[]{42}, new int[]{42}),
            new TestCase<>("Empty Array", new int[]{}, new int[]{}),
            new TestCase<>("All Identical Elements", new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}),
            new TestCase<>("Two Elements", new int[]{1, 2}, new int[]{2, 1}),
            new TestCase<>("Negative Elements", new int[]{-5, -4, -3, -2, -1}, new int[]{-1, -2, -3, -4, -5}),
            new TestCase<>("Palindrome Array", new int[]{1, 2, 3, 2, 1}, new int[]{1, 2, 3, 2, 1}),
            new TestCase<>("Sparse Elements", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 1, 0, 0}),
            new TestCase<>("Boundary Integers", new int[]{2147483647, -2147483648}, new int[]{-2147483648, 2147483647})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Reverse Array (DEBUG)",
            testCases,
            input -> ReverseArrayDebug.solve(input.clone()), 
            false 
        );
    }
}
