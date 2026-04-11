// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ArmstrongNumber.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ArmstrongNumberTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Boolean>> testCases = List.of(
            new TestCase<>("Single Digit 5", 5, true),
            new TestCase<>("Classic 153", 153, true),
            new TestCase<>("Classic 370", 370, true),
            new TestCase<>("Classic 371", 371, true),
            new TestCase<>("Classic 407", 407, true),
            new TestCase<>("4 Digit 1634", 1634, true),
            new TestCase<>("Not Armstrong 123", 123, false),
            new TestCase<>("Not Armstrong 1000", 1000, false),
            new TestCase<>("Zero Case", 0, true),
            new TestCase<>("Large Non-Armstrong", 1234567, false)
        );

        TestRunner<Integer, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Armstrong Number",
            testCases,
            input -> ArmstrongNumber.solve(input), 
            true 
        );
    }
}
