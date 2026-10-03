// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RepeatedSubstringPattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class RepeatedSubstringPatternTest {

    static class Input {
        final String s;

        Input(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "s=\"" + s + "\"";
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>(
                "Standard Two Repetitions",
                new Input("abab"),
                true
            ),
            new TestCase<>(
                "Single Character Mismatch Non Repeating",
                new Input("aba"),
                false
            ),
            new TestCase<>(
                "Four Repetitions Of Three Letters",
                new Input("abcabcabcabc"),
                true
            ),
            new TestCase<>(
                "Single Character String Cannot Form Repetitions",
                new Input("a"),
                false
            ),
            new TestCase<>(
                "Two Identical Characters",
                new Input("aa"),
                true
            ),
            new TestCase<>(
                "Three Identical Characters",
                new Input("aaa"),
                true
            ),
            new TestCase<>(
                "Four Distinct Characters Mismatched Ending",
                new Input("abac"),
                false
            ),
            new TestCase<>(
                "Two Repetitions Five Characters Each",
                new Input("abcdeabcde"),
                true
            ),
            new TestCase<>(
                "Three Repetitions Four Characters Each",
                new Input("abcdabcdabcd"),
                true
            ),
            new TestCase<>(
                "Overlapping Prefix Suffix Non Divisible Period",
                new Input("aabaaba"),
                false
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Repeated Substring Pattern",
            testCases,
            input -> RepeatedSubstringPattern.solve(input.s),
            true
        );
    }
}
