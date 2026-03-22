package com.csrgo.problems.testpath.AddTwoNumbers.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AddTwoNumbersDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], Integer>> testCases = List.of(

                new TestCase<>("Basic Positive", new int[]{5, 7}, 12),

                new TestCase<>("Zero Case", new int[]{0, 5}, 5),

                new TestCase<>("Both Negative", new int[]{-3, -7}, -10),

                new TestCase<>("Mixed Values", new int[]{-5, 10}, 5),

                new TestCase<>("Large Numbers", new int[]{1_000_000_000, 1_000_000_000}, 2_000_000_000)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
                "Add Two Numbers - Engineering Mode",
                testCases,
                input -> AddTwoNumbersDebug.add(input[0], input[1]),
                false
        );
    }
}