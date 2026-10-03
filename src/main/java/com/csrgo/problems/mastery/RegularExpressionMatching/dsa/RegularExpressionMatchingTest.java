// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RegularExpressionMatching.dsa;

import java.util.*;
import com.csrgo.util.*;

public class RegularExpressionMatchingTest {

    static class Input {
        final String s;
        final String p;

        Input(String s, String p) {
            this.s = s;
            this.p = p;
        }

        @Override
        public String toString() {
            return "s=\"" + s + "\", p=\"" + p + "\"";
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>(
                "Single Character Mismatch Underlength Pattern",
                new Input("aa", "a"),
                false
            ),
            new TestCase<>(
                "Star Matches Preceding Character Twice",
                new Input("aa", "a*"),
                true
            ),
            new TestCase<>(
                "Dot Star Matches Arbitrary String",
                new Input("ab", ".*"),
                true
            ),
            new TestCase<>(
                "Zero Occurrences Of Unmatched Leading Character",
                new Input("aab", "c*a*b"),
                true
            ),
            new TestCase<>(
                "Complex Multi Token Mismatch Sequence",
                new Input("mississippi", "mis*is*p*."),
                false
            ),
            new TestCase<>(
                "Complex Multi Token Correct Match Sequence",
                new Input("mississippi", "mis*is*ip*."),
                true
            ),
            new TestCase<>(
                "Empty String Matches Dot Star",
                new Input("", ".*"),
                true
            ),
            new TestCase<>(
                "Trailing Literal Character Mismatch",
                new Input("ab", ".*c"),
                false
            ),
            new TestCase<>(
                "Star With Trailing Exact Character Match",
                new Input("aaa", "a*a"),
                true
            ),
            new TestCase<>(
                "Consecutive Quantifiers With Exact Suffix",
                new Input("bbbba", ".*a*a"),
                true
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Regular Expression Matching",
            testCases,
            input -> RegularExpressionMatching.solve(input.s, input.p),
            true
        );
    }
}
