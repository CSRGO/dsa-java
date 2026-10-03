// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignLoggerRateLimiter.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DesignLoggerRateLimiterDebugTest {

    static class Input {
        final int[] timestamps;
        final String[] messages;

        Input(int[] timestamps, String[] messages) {
            this.timestamps = timestamps;
            this.messages = messages;
        }

        @Override
        public String toString() {
            return "times=" + Arrays.toString(timestamps) + ", msgs=" + Arrays.toString(messages);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, boolean[]>> testCases = List.of(
            new TestCase<>("Classic Message Stream", new Input(new int[]{1, 2, 3, 8, 10, 11}, new String[]{"foo", "bar", "foo", "bar", "foo", "foo"}), new boolean[]{true, true, false, false, false, true}),
            new TestCase<>("Exact Ten Second Boundary", new Input(new int[]{1, 11}, new String[]{"test", "test"}), new boolean[]{true, true}),
            new TestCase<>("Different Messages Same Time", new Input(new int[]{0, 0}, new String[]{"msg1", "msg2"}), new boolean[]{true, true}),
            new TestCase<>("Repeated Immediate Duplicates", new Input(new int[]{1, 1, 1}, new String[]{"a", "a", "a"}), new boolean[]{true, false, false}),
            new TestCase<>("Nine Seconds Rejection", new Input(new int[]{5, 14}, new String[]{"ping", "ping"}), new boolean[]{true, false}),
            new TestCase<>("Single Message", new Input(new int[]{100}, new String[]{"hello"}), new boolean[]{true}),
            new TestCase<>("Multiple Cooldown Cycles", new Input(new int[]{0, 10, 20, 30}, new String[]{"tick", "tick", "tick", "tick"}), new boolean[]{true, true, true, true}),
            new TestCase<>("Interleaved Alternating Stream", new Input(new int[]{1, 2, 11, 12}, new String[]{"A", "B", "A", "B"}), new boolean[]{true, true, true, true}),
            new TestCase<>("Long Delay Between Logs", new Input(new int[]{1, 1000}, new String[]{"rare", "rare"}), new boolean[]{true, true}),
            new TestCase<>("Burst In Same Second Different Strings", new Input(new int[]{10, 10, 10}, new String[]{"x", "y", "z"}), new boolean[]{true, true, true})
        );

        TestRunner<Input, boolean[]> runner = new TestRunner<>();

        runner.runTests(
            "Design Logger Rate Limiter (DEBUG)",
            testCases,
            input -> DesignLoggerRateLimiterDebug.solve(input.timestamps, input.messages),
            false
        );
    }
}
