// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.GCDAndLCM.dsa;

import java.util.*;
import com.csrgo.util.*;

public class GCDAndLCMTest {

    public static void main(String[] args) {

        List<TestCase<int[], long[]>> testCases = List.of(
            new TestCase<>("Normal Case", new int[]{24, 36}, new long[]{12, 72}),
            new TestCase<>("Prime Numbers", new int[]{13, 17}, new long[]{1, 221}),
            new TestCase<>("One Multiplier of Other", new int[]{10, 50}, new long[]{10, 50}),
            new TestCase<>("Same Numbers", new int[]{45, 45}, new long[]{45, 45}),
            new TestCase<>("One is 1", new int[]{1, 100}, new long[]{1, 100}),
            new TestCase<>("Large Numbers", new int[]{1000000, 2000000}, new long[]{1000000, 2000000}),
            new TestCase<>("Even and Odd", new int[]{15, 20}, new long[]{5, 60}),
            new TestCase<>("Strict GCD 1", new int[]{8, 9}, new long[]{1, 72}),
            new TestCase<>("Co-primes", new int[]{21, 22}, new long[]{1, 462}),
            new TestCase<>("Power of 2", new int[]{16, 64}, new long[]{16, 64})
        );

        TestRunner<int[], long[]> runner = new TestRunner<>();

        runner.runTests(
            "GCD and LCM",
            testCases,
            input -> GCDAndLCM.solve(input[0], input[1]), 
            true 
        );
    }
}
