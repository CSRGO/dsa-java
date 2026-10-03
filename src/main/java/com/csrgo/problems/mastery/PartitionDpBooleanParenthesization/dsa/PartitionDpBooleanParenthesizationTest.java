// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PartitionDpBooleanParenthesization.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PartitionDpBooleanParenthesizationTest {

    static class Input {
        final String s;

        Input(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return s;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard GFG Expression",
                new Input("T|T&F^T"),
                4
            ),
            new TestCase<>(
                "Three Symbol XOR and OR",
                new Input("T^F|F"),
                2
            ),
            new TestCase<>(
                "Two Symbol OR True",
                new Input("T|F"),
                1
            ),
            new TestCase<>(
                "Two Symbol AND False",
                new Input("T&F"),
                0
            ),
            new TestCase<>(
                "Two Symbol XOR Same",
                new Input("T^T"),
                0
            ),
            new TestCase<>(
                "Single True Literal",
                new Input("T"),
                1
            ),
            new TestCase<>(
                "Single False Literal",
                new Input("F"),
                0
            ),
            new TestCase<>(
                "Three True XOR Chain",
                new Input("T^T^T"),
                2
            ),
            new TestCase<>(
                "Mixed Operators Five Literals",
                new Input("T|T|F&T"),
                5
            ),
            new TestCase<>(
                "Starting False Literal Complex",
                new Input("F|T^F&T"),
                5
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Partition DP (Boolean Parenthesization)",
            testCases,
            input -> PartitionDpBooleanParenthesization.solve(input.s),
            true
        );
    }
}
