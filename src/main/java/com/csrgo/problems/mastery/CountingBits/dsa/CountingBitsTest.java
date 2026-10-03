// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CountingBits.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CountingBitsTest {

    static class Input {
        int n;

        Input(int n) {
            this.n = n;
        }

        @Override
        public String toString() {
            return "n=" + n;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Small Value Two",
                new Input(2),
                new int[]{0, 1, 1}
            ),
            new TestCase<>(
                "Medium Value Five",
                new Input(5),
                new int[]{0, 1, 1, 2, 1, 2}
            ),
            new TestCase<>(
                "Zero Boundary Case",
                new Input(0),
                new int[]{0}
            ),
            new TestCase<>(
                "Single Unit Value",
                new Input(1),
                new int[]{0, 1}
            ),
            new TestCase<>(
                "Power Of Two Four",
                new Input(4),
                new int[]{0, 1, 1, 2, 1}
            ),
            new TestCase<>(
                "All Ones Mask Seven",
                new Input(7),
                new int[]{0, 1, 1, 2, 1, 2, 2, 3}
            ),
            new TestCase<>(
                "Power Of Two Eight",
                new Input(8),
                new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}
            ),
            new TestCase<>(
                "Value Ten Even Composite",
                new Input(10),
                new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2}
            ),
            new TestCase<>(
                "Three Full Two Bit Range",
                new Input(3),
                new int[]{0, 1, 1, 2}
            ),
            new TestCase<>(
                "Fifteen Full Four Bit Range",
                new Input(15),
                new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Counting Bits",
            testCases,
            input -> CountingBits.solve(input.n),
            true
        );
    }
}
