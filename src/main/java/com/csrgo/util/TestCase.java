package com.csrgo.util;

public class TestCase<I, O> {

    public final String name;
    public final I input;
    public final O expected;

    public TestCase(String name, I input, O expected) {
        this.name = name;
        this.input = input;
        this.expected = expected;
    }
}
