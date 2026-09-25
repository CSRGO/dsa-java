// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.CeilAndFloor.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CeilAndFloorDebugTest {

    static class Input {
        final int[] nums;
        final int target;

        Input(int[] nums, int target) {
            this.nums = nums;
            this.target = target;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", target=" + target;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Target In Array", new Input(new int[]{10, 20, 30, 40, 50}, 30), new int[]{30, 30}),
            new TestCase<>("Target Between Elements", new Input(new int[]{10, 20, 30, 40, 50}, 25), new int[]{30, 20}),
            new TestCase<>("Target Smaller Than All", new Input(new int[]{10, 20, 30, 40, 50}, 5), new int[]{10, -1}),
            new TestCase<>("Target Greater Than All", new Input(new int[]{10, 20, 30, 40, 50}, 55), new int[]{-1, 50}),
            new TestCase<>("Single Element Match", new Input(new int[]{42}, 42), new int[]{42, 42}),
            new TestCase<>("Single Element Target Smaller", new Input(new int[]{42}, 10), new int[]{42, -1}),
            new TestCase<>("Single Element Target Greater", new Input(new int[]{42}, 100), new int[]{-1, 42}),
            new TestCase<>("Empty Array", new Input(new int[]{}, 15), new int[]{-1, -1}),
            new TestCase<>("Large Array Step Search", new Input(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, 35), new int[]{40, 30}),
            new TestCase<>("First Element Boundary", new Input(new int[]{10, 20, 30, 40, 50}, 10), new int[]{10, 10})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Ceil and Floor (DEBUG)",
            testCases,
            input -> CeilAndFloorDebug.solve(input.nums, input.target), 
            false 
        );
    }
}
