// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.RotateANumber.dsa;

import java.util.*;
import com.csrgo.util.*;

public class RotateANumberTest {

    public static void main(String[] args) {

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Positive Rotation", new int[]{12345, 2}, 45123),
            new TestCase<>("Larger k", new int[]{12345, 7}, 45123),
            new TestCase<>("Negative Rotation", new int[]{12345, -2}, 34512),
            new TestCase<>("k as 0", new int[]{12345, 0}, 12345),
            new TestCase<>("k as length", new int[]{12345, 5}, 12345),
            new TestCase<>("k as -length", new int[]{12345, -5}, 12345),
            new TestCase<>("Single Digit", new int[]{7, 10}, 7),
            new TestCase<>("Large k", new int[]{56298, 100}, 56298),
            new TestCase<>("Extreme k", new int[]{123, 1}, 312),
            new TestCase<>("Zero handling", new int[]{100, 1}, 10)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Rotate a Number",
            testCases,
            input -> RotateANumber.solve(input[0], input[1]), 
            true 
        );
    }
}
