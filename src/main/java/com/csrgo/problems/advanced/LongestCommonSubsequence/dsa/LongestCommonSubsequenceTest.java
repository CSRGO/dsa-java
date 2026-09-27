// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LongestCommonSubsequence.dsa;

import java.util.*;
import com.csrgo.util.*;

public class LongestCommonSubsequenceTest {

    static class Input {
        final String text1;
        final String text2;

        Input(String text1, String text2) {
            this.text1 = text1;
            this.text2 = text2;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Subsequence Characters Dispersed", new Input("abcde", "ace"), 3),
            new TestCase<>("Identical Strings Match", new Input("abc", "abc"), 3),
            new TestCase<>("Completely Disjoint Characters", new Input("abc", "def"), 0),
            new TestCase<>("First String Empty", new Input("", "abc"), 0),
            new TestCase<>("Second String Empty", new Input("abc", ""), 0),
            new TestCase<>("Classic Interleaved Strings", new Input("aggtab", "gxtxayb"), 4),
            new TestCase<>("Substrings With Embedded Matches", new Input("stone", "longest"), 3),
            new TestCase<>("Suffix Match Comparison", new Input("programming", "gaming"), 6),
            new TestCase<>("Substring Fully Contained", new Input("abcdefgh", "cde"), 3),
            new TestCase<>("Reversed String Sequence", new Input("abcd", "dcba"), 1)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Longest Common Subsequence",
            testCases,
            input -> LongestCommonSubsequence.solve(input.text1, input.text2),
            true
        );
    }
}
