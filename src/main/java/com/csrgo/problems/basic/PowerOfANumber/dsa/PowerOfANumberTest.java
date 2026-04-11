// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PowerOfANumber.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PowerOfANumberTest {

    public static void main(String[] args) {

        List<TestCase<int[], Long>> testCases = List.of(
            new TestCase<>("2 to the power 5", new int[]{2, 5}, 32L),
            new TestCase<>("Base case n=0", new int[]{5, 0}, 1L),
            new TestCase<>("Neg base even power", new int[]{-2, 4}, 16L),
            new TestCase<>("Neg base odd power", new int[]{-3, 3}, -27L),
            new TestCase<>("Power of 1", new int[]{10, 1}, 10L),
            new TestCase<>("Large power of 2", new int[]{2, 10}, 1024L),
            new TestCase<>("Zero base", new int[]{0, 5}, 0L),
            new TestCase<>("Base 1", new int[]{1, 100}, 1L),
            new TestCase<>("Base -1 even", new int[]{-1, 50}, 1L),
            new TestCase<>("Base -1 odd", new int[]{-1, 51}, -1L)
        );

        TestRunner<int[], Long> runner = new TestRunner<>();

        runner.runTests(
            "Power of a Number",
            testCases,
            input -> PowerOfANumber.solve(input[0], input[1]), 
            true 
        );
    }
}
