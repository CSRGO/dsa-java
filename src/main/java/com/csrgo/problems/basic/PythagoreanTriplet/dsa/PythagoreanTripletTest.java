// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PythagoreanTriplet.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PythagoreanTripletTest {

    public static void main(String[] args) {

        List<TestCase<int[], Boolean>> testCases = List.of(
            new TestCase<>("Classic 3-4-5", new int[]{3, 4, 5}, true),
            new TestCase<>("Classic Out of Order", new int[]{5, 3, 4}, true),
            new TestCase<>("Classic 5-12-13", new int[]{5, 12, 13}, true),
            new TestCase<>("Classic 8-15-17", new int[]{8, 15, 17}, true),
            new TestCase<>("Not a Triplet", new int[]{10, 20, 30}, false),
            new TestCase<>("Almost Triplet", new int[]{3, 4, 6}, false),
            new TestCase<>("Large Triplet", new int[]{100, 240, 260}, true),
            new TestCase<>("Single Digit Small", new int[]{1, 1, 1}, false),
            new TestCase<>("Isosceles non-triplet", new int[]{5, 5, 5}, false),
            new TestCase<>("Maximum Constraint Approx", new int[]{1000000, 2000000, 3000000}, false)
        );

        TestRunner<int[], Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Pythagorean Triplet",
            testCases,
            input -> PythagoreanTriplet.solve(input[0], input[1], input[2]), 
            true 
        );
    }
}
