// All rights reserved to CSRGO DSA
package com.csrgo.util;

public class TestCase<I, O> {

    @FunctionalInterface
    public interface Action<O> {
        O run() throws Throwable;
    }

    public final String name;
    public final I input;
    public final O expected;
    public final Action<O> action;

    public TestCase(String name, I input, O expected) {
        this.name = name;
        this.input = input;
        this.expected = expected;
        this.action = null;
    }

    public TestCase(I input, O expected) {
        this("Test Case", input, expected);
    }

    public TestCase(String name, Action<O> action, O expected) {
        this.name = name;
        this.input = null;
        this.expected = expected;
        this.action = action;
    }
}

