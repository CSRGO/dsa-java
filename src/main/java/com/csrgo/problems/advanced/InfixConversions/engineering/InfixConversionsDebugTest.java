// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.InfixConversions.engineering;

import java.util.*;
import com.csrgo.util.*;

public class InfixConversionsDebugTest {

    public static void main(String[] args) {

        List<TestCase<String, String[]>> testCases = List.of(
            new TestCase<>("Precedence Multiplication Over Addition", "a + b * c", new String[]{"abc*+", "+a*bc"}),
            new TestCase<>("Parentheses Overriding Precedence", "(a + b) * c", new String[]{"ab+c*", "*+abc"}),
            new TestCase<>("Simple Binary Addition", "a + b", new String[]{"ab+", "+ab"}),
            new TestCase<>("Two Products Added", "a * b + c / d", new String[]{"ab*cd/+", "+*ab/cd"}),
            new TestCase<>("Divided Parenthesized Groups", "(a + b) / (c - d)", new String[]{"ab+cd-/", "/+ab-cd"}),
            new TestCase<>("Left Associative Add Sub", "a + b - c", new String[]{"ab+c-", "-+abc"}),
            new TestCase<>("Multiplication Group Divided", "a * (b + c) / d", new String[]{"abc+*d/", "/*a+bcd"}),
            new TestCase<>("Single Variable Operand", "a", new String[]{"a", "a"}),
            new TestCase<>("Parenthesized Single Variable", "(a)", new String[]{"a", "a"}),
            new TestCase<>("Deeply Nested Operations", "a + (b - c * (d / e))", new String[]{"abcde/*-*+", "+a-b*c/de"})
        );

        TestRunner<String, String[]> runner = new TestRunner<>();

        runner.runTests(
            "Infix Conversions (DEBUG)",
            testCases,
            input -> InfixConversionsDebug.solve(input),
            false
        );
    }
}
