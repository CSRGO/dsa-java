// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DecimalToAnyBase.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DecimalToAnyBaseDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], Long>> testCases = List.of(
            new TestCase<>("Octal Conversion", new int[]{634, 8}, 1172L),
            new TestCase<>("Binary Conversion", new int[]{57, 2}, 111001L),
            new TestCase<>("Zero Number", new int[]{0, 8}, 0L),
            new TestCase<>("Base 10 Identity", new int[]{100, 10}, 100L),
            new TestCase<>("Base 2 All Ones", new int[]{7, 2}, 111L),
            new TestCase<>("Ternary Power", new int[]{81, 3}, 10000L),
            new TestCase<>("Quinary Power", new int[]{125, 5}, 1000L),
            new TestCase<>("Eight Bits Binary", new int[]{255, 2}, 11111111L),
            new TestCase<>("Septenary Base 7", new int[]{1000, 7}, 2626L),
            new TestCase<>("Nonary Base 9", new int[]{10000, 9}, 14641L)
        );

        TestRunner<int[], Long> runner = new TestRunner<>();

        runner.runTests(
            "Decimal to Any Base (DEBUG)",
            testCases,
            input -> DecimalToAnyBaseDebug.solve(input[0], input[1]), 
            false 
        );
    }
}
