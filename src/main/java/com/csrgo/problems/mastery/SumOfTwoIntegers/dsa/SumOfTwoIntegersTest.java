// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SumOfTwoIntegers.dsa;

import java.util.*;
import com.csrgo.util.*;

public class SumOfTwoIntegersTest {

    static class Input {
        int a;
        int b;

        Input(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "a=" + a + ", b=" + b;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Small Positive Numbers One And Two",
                new Input(1, 2),
                3
            ),
            new TestCase<>(
                "Positive Numbers Two And Three",
                new Input(2, 3),
                5
            ),
            new TestCase<>(
                "Opposite Signs Canceling To Zero",
                new Input(-1, 1),
                0
            ),
            new TestCase<>(
                "Both Operands Zero",
                new Input(0, 0),
                0
            ),
            new TestCase<>(
                "Both Operands Negative",
                new Input(-10, -20),
                -30
            ),
            new TestCase<>(
                "Positive And Smaller Negative",
                new Input(15, -5),
                10
            ),
            new TestCase<>(
                "Thousands Addition",
                new Input(1000, 2000),
                3000
            ),
            new TestCase<>(
                "Negative And Larger Positive",
                new Input(-50, 100),
                50
            ),
            new TestCase<>(
                "Zero Plus Forty Two",
                new Input(0, 42),
                42
            ),
            new TestCase<>(
                "Addition Near Maximum Integer Value",
                new Input(2147483646, 1),
                2147483647
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Sum of Two Integers (No + / -)",
            testCases,
            input -> SumOfTwoIntegers.solve(input.a, input.b),
            true
        );
    }
}
