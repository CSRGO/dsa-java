package com.csrgo.problems.testpath.AddTwoNumbers.dsa;

import java.util.*;

import com.csrgo.problems.testpath.AddTwoNumbers.dsa.AddTwoNumbers;
import com.csrgo.util.*;

public class AddTwoNumbersTest {

    public static void main(String[] args) {

        List<TestCase<int[], Integer>> testCases = List.of(

                new TestCase<>("Basic Positive",
                        new int[]{5, 7},
                        12),

                new TestCase<>("Zero Handling",
                        new int[]{0, 0},
                        0),

                new TestCase<>("Mixed Values",
                        new int[]{-5, 10},
                        5),

                new TestCase<>("Both Negative",
                        new int[]{-3, -7},
                        -10),

                new TestCase<>("Large Numbers",
                        new int[]{1_000_000, 2_000_000},
                        3_000_000)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
                "Add Two Numbers",
                testCases,
                input -> AddTwoNumbers.add(input[0], input[1]),
                true
        );
    }
}