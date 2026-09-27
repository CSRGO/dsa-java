// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BalancedBrackets.engineering;

import java.util.*;
import com.csrgo.util.*;

public class BalancedBracketsDebugTest {

    public static void main(String[] args) {

        List<TestCase<String, Boolean>> testCases = List.of(
            new TestCase<>("All Three Bracket Types Perfectly Nested", "[(a+b)+{(c+d)*(e/f)}]", true),
            new TestCase<>("Incorrect Bracket Nesting Order", "[(a+b)+{(c+d)*(e/f)]}", false),
            new TestCase<>("Unmatched Opening Parenthesis", "(a+b", false),
            new TestCase<>("Unmatched Closing Bracket", "a+b)", false),
            new TestCase<>("Simple Curly and Square Pair", "{[()]}", true),
            new TestCase<>("Interleaved Invalid Sequence", "([)]", false),
            new TestCase<>("Empty Expression String", "", true),
            new TestCase<>("String Without Brackets", "a + b * c", true),
            new TestCase<>("Only Opening Sequences", "((({{{[[[", false),
            new TestCase<>("Consecutive Independent Balanced Groups", "()[]{}{[()()]}", true)
        );

        TestRunner<String, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Balanced Brackets (DEBUG)",
            testCases,
            input -> BalancedBracketsDebug.solve(input),
            false
        );
    }
}
