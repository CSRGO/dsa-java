// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WildcardPatternMatching.engineering;

import java.util.*;
import com.csrgo.util.*;

public class WildcardPatternMatchingDebugTest {

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
                "Single Wildcard Star Matches Multiple Letters",
                new Input("aa", "*"),
                true
            ),
            new TestCase<>(
                "Question Mark Mismatch In Pattern",
                new Input("cb", "?a"),
                false
            ),
            new TestCase<>(
                "Multiple Stars Between Fixed Delimiters",
                new Input("adceb", "*a*b"),
                true
            ),
            new TestCase<>(
                "Star And Question Mark Intermediate Mismatch",
                new Input("acdcb", "a*c?b"),
                false
            ),
            new TestCase<>(
                "Empty String Matches Star",
                new Input("", "*"),
                true
            ),
            new TestCase<>(
                "Both String And Pattern Empty",
                new Input("", ""),
                true
            ),
            new TestCase<>(
                "Exact Character Match No Wildcards",
                new Input("abc", "abc"),
                true
            ),
            new TestCase<>(
                "More Question Marks Than Available Characters",
                new Input("abc", "????*"),
                false
            ),
            new TestCase<>(
                "Complex Multi Token Mismatch",
                new Input("mississippi", "m??*ss*?i*pi"),
                false
            ),
            new TestCase<>(
                "Trailing Consecutive Stars",
                new Input("ho", "ho**"),
                true
            )
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Wildcard Pattern Matching (DEBUG)",
            testCases,
            input -> WildcardPatternMatchingDebug.solve(input.s, input.p),
            false
        );
    }
}
