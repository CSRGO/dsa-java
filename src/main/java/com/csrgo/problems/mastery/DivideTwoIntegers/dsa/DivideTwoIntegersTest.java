// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DivideTwoIntegers.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DivideTwoIntegersTest {

    static class Input {
        int dividend;
        int divisor;

        Input(int dividend, int divisor) {
            this.dividend = dividend;
            this.divisor = divisor;
        }

        @Override
        public String toString() {
            return "dividend=" + dividend + ", divisor=" + divisor;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Positive Numbers",
                new Input(10, 3),
                3
            ),
            new TestCase<>(
                "Positive Divided By Negative",
                new Input(7, -3),
                -2
            ),
            new TestCase<>(
                "Zero Dividend",
                new Input(0, 1),
                0
            ),
            new TestCase<>(
                "Unit Divided By Unit",
                new Input(1, 1),
                1
            ),
            new TestCase<>(
                "Minimum Integer Divided By Minus One Overflow",
                new Input(-2147483648, -1),
                2147483647
            ),
            new TestCase<>(
                "Minimum Integer Divided By One",
                new Input(-2147483648, 1),
                -2147483648
            ),
            new TestCase<>(
                "Minimum Integer Divided By Two",
                new Input(-2147483648, 2),
                -1073741824
            ),
            new TestCase<>(
                "Maximum Integer Divided By Two",
                new Input(2147483647, 2),
                1073741823
            ),
            new TestCase<>(
                "Negative Dividend Exact Division",
                new Input(-15, 5),
                -3
            ),
            new TestCase<>(
                "Larger Numbers Exact Division",
                new Input(100, 25),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Divide Two Integers",
            testCases,
            input -> DivideTwoIntegers.solve(input.dividend, input.divisor),
            true
        );
    }
}
