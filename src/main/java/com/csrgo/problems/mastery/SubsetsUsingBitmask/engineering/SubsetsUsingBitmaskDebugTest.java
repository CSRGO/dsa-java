// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubsetsUsingBitmask.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SubsetsUsingBitmaskDebugTest {

    static class Input {
        int[] nums;

        Input(int[] nums) {
            this.nums = nums;
        }

        @Override
        public String toString() {
            return Arrays.toString(nums);
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, List<List<Integer>>>> testCases = List.of(
            new TestCase<>(
                "Three Elements One Two Three",
                new Input(new int[]{1, 2, 3}),
                List.of(
                    List.of(),
                    List.of(1),
                    List.of(2),
                    List.of(1, 2),
                    List.of(3),
                    List.of(1, 3),
                    List.of(2, 3),
                    List.of(1, 2, 3)
                )
            ),
            new TestCase<>(
                "Single Element Zero",
                new Input(new int[]{0}),
                List.of(
                    List.of(),
                    List.of(0)
                )
            ),
            new TestCase<>(
                "Empty Array Base Case",
                new Input(new int[]{}),
                List.of(
                    List.of()
                )
            ),
            new TestCase<>(
                "Two Elements One Two",
                new Input(new int[]{1, 2}),
                List.of(
                    List.of(),
                    List.of(1),
                    List.of(2),
                    List.of(1, 2)
                )
            ),
            new TestCase<>(
                "Single Element Four",
                new Input(new int[]{4}),
                List.of(
                    List.of(),
                    List.of(4)
                )
            ),
            new TestCase<>(
                "Negative And Positive Elements",
                new Input(new int[]{-1, 1}),
                List.of(
                    List.of(),
                    List.of(-1),
                    List.of(1),
                    List.of(-1, 1)
                )
            ),
            new TestCase<>(
                "Two Elements With Zero",
                new Input(new int[]{9, 0}),
                List.of(
                    List.of(),
                    List.of(9),
                    List.of(0),
                    List.of(9, 0)
                )
            ),
            new TestCase<>(
                "Three Sequential Elements Five Six Seven",
                new Input(new int[]{5, 6, 7}),
                List.of(
                    List.of(),
                    List.of(5),
                    List.of(6),
                    List.of(5, 6),
                    List.of(7),
                    List.of(5, 7),
                    List.of(6, 7),
                    List.of(5, 6, 7)
                )
            ),
            new TestCase<>(
                "Single Element Ten",
                new Input(new int[]{10}),
                List.of(
                    List.of(),
                    List.of(10)
                )
            ),
            new TestCase<>(
                "Three Even Numbers Two Four Six",
                new Input(new int[]{2, 4, 6}),
                List.of(
                    List.of(),
                    List.of(2),
                    List.of(4),
                    List.of(2, 4),
                    List.of(6),
                    List.of(2, 6),
                    List.of(4, 6),
                    List.of(2, 4, 6)
                )
            )
        );

        TestRunner<Input, List<List<Integer>>> runner = new TestRunner<>();

        runner.runTests(
            "Subsets using Bitmask (Debug)",
            testCases,
            input -> SubsetsUsingBitmaskDebug.solve(input.nums.clone()),
            false
        );
    }
}
