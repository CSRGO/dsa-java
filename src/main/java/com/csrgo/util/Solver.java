package com.csrgo.util;

@FunctionalInterface
public interface Solver<I, O> {
    O solve(I input);
}