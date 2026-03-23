// All rights reserved to CSRGO DSA
package com.csrgo.util;

@FunctionalInterface
public interface Solver<I, O> {
    O solve(I input);
}