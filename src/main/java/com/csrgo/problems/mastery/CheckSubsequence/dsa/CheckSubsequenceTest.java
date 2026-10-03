// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CheckSubsequence.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CheckSubsequenceTest {

    static class Input {
        final String s;
        final String t;

        Input(String s, String t) {
            this.s = s;
            this.t = t;
        }

        @Override
        public String toString() {
            return "s=\"" + s + "\", t=\"" + t + "\"";
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>(
                "Standard Matching Subsequence",
                new Input("abc", "ahbgdc"),
                true
            ),
            new TestCase<>(
                "Missing Character Non Subsequence",
                new Input("axc", "ahbgdc"),
                false
            ),
            new TestCase<>(
                "Empty Pattern Subsequence Of Any String",
                new Input("", "anystring"),
                true
            ),
            new TestCase<>(
                "Single Character Mismatch",
                new Input("b", "c"),
                false
            ),
            new TestCase<>(
                "Dispersed Characters In Order",
                new Input("ace", "abcde"),
                true
            ),
            new TestCase<>(
                "Same Characters Inverted Order",
                new Input("aec", "abcde"),
                false
            ),
            new TestCase<>(
                "Identical Strings Match",
                new Input("singles", "singles"),
                true
            ),
            new TestCase<>(
                "Duplicate Consecutive Characters Match",
                new Input("aaaa", "bbaaaa"),
                true
            ),
            new TestCase<>(
                "Insufficient Frequency Of Character",
                new Input("aaaa", "bbaaa"),
                false
            ),
            new TestCase<>(
                "Non Empty Pattern With Empty Source",
                new Input("g", ""),
                false
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Check Subsequence",
            testCases,
            input -> CheckSubsequence.solve(input.s, input.t),
            true
        );
    }
}
