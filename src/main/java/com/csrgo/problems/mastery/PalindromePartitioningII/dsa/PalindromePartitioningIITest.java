// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PalindromePartitioningII.dsa;

import java.util.*;
import com.csrgo.util.*;

public class PalindromePartitioningIITest {

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
                "Standard String AAB",
                new Input("aab"),
                1
            ),
            new TestCase<>(
                "Single Character",
                new Input("a"),
                0
            ),
            new TestCase<>(
                "Two Distinct Characters",
                new Input("ab"),
                1
            ),
            new TestCase<>(
                "Full Odd Length Palindrome",
                new Input("racecar"),
                0
            ),
            new TestCase<>(
                "All Distinct Characters",
                new Input("abcde"),
                4
            ),
            new TestCase<>(
                "Repeated Alternating Long Sequence",
                new Input("ababbbabbababa"),
                3
            ),
            new TestCase<>(
                "Multiple Sub Palindromes",
                new Input("noonabbad"),
                2
            ),
            new TestCase<>(
                "All Same Characters",
                new Input("aaaa"),
                0
            ),
            new TestCase<>(
                "Center Embedded Palindrome",
                new Input("cbbbcc"),
                1
            ),
            new TestCase<>(
                "Ten Character Complex String",
                new Input("ccaacabacb"),
                3
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Palindrome Partitioning II",
            testCases,
            input -> PalindromePartitioningII.solve(input.s),
            true
        );
    }
}
