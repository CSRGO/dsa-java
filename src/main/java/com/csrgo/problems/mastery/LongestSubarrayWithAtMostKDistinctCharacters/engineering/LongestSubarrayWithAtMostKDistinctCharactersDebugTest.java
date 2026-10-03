// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestSubarrayWithAtMostKDistinctCharacters.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LongestSubarrayWithAtMostKDistinctCharactersDebugTest {

    static class Input {
        String s;
        int k;

        Input(String s, int k) {
            this.s = s;
            this.k = k;
        }

        @Override
        public String toString() {
            return "s=\"" + s + "\", k=" + k;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Two Distinct Letters Window",
                new Input("eceba", 2),
                3
            ),
            new TestCase<>(
                "Identical Letters String",
                new Input("aa", 1),
                2
            ),
            new TestCase<>(
                "Zero Allowed Distinct Characters",
                new Input("a", 0),
                0
            ),
            new TestCase<>(
                "Triplicate C Characters With A And B",
                new Input("abaccc", 2),
                4
            ),
            new TestCase<>(
                "Single Character With Larger K",
                new Input("a", 2),
                1
            ),
            new TestCase<>(
                "Long Repeating Segments B",
                new Input("ccaabbb", 2),
                5
            ),
            new TestCase<>(
                "All Distinct Letters K Equals One",
                new Input("abcde", 1),
                1
            ),
            new TestCase<>(
                "K Equals String Length",
                new Input("abcde", 5),
                5
            ),
            new TestCase<>(
                "Empty String Boundary Case",
                new Input("", 3),
                0
            ),
            new TestCase<>(
                "Repeating Pattern With Interleaved Letters",
                new Input("pwwkew", 2),
                3
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Longest Subarray with At Most K Distinct Characters (Debug)",
            testCases,
            input -> LongestSubarrayWithAtMostKDistinctCharactersDebug.solve(input.s, input.k),
            false
        );
    }
}
