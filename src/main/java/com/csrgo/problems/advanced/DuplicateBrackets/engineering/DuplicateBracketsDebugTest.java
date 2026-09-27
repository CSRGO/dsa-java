// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DuplicateBrackets.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DuplicateBracketsDebugTest {

    public static void main(String[] args) {

        List<TestCase<String, Boolean>> testCases = List.of(
            new TestCase<>("Double Enclosed Expression", "((a+b)+(c+d))", false),
            new TestCase<>("Redundant Nested Brackets", "(a+b)+((c+d))", true),
            new TestCase<>("Single Redundant Parentheses", "((a+b))", true),
            new TestCase<>("Simple Valid Expression", "(a+b)", false),
            new TestCase<>("Empty Parentheses", "(())", true),
            new TestCase<>("Multiple Operations Unnested", "(a+b)*(c-d)/(e+f)", false),
            new TestCase<>("Deeply Redundant Nesting", "(((a)))", true),
            new TestCase<>("Redundant Operator Subexpression", "((a))", true),
            new TestCase<>("Balanced Chain Without Redundancy", "((a+b)+(c*(d+e)))", false),
            new TestCase<>("Complex Redundant Ending", "(a+b)+(((c+d)*(e+f)))", true)
        );

        TestRunner<String, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Duplicate Brackets (DEBUG)",
            testCases,
            input -> DuplicateBracketsDebug.solve(input),
            false
        );
    }
}
