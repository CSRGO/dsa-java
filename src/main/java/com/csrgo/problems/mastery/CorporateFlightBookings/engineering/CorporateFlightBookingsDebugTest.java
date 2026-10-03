// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CorporateFlightBookings.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CorporateFlightBookingsDebugTest {

    static class Input {
        int[][] bookings;
        int n;

        Input(int[][] bookings, int n) {
            this.bookings = bookings;
            this.n = n;
        }

        @Override
        public String toString() {
            return "bookings=" + Arrays.deepToString(bookings) + ", n=" + n;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>(
                "Multiple Overlapping Bookings Range Up To Five",
                new Input(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}, 5),
                new int[]{10, 55, 45, 25, 25}
            ),
            new TestCase<>(
                "Two Flights Point And Range Update",
                new Input(new int[][]{{1, 2, 10}, {2, 2, 15}}, 2),
                new int[]{10, 25}
            ),
            new TestCase<>(
                "Single Flight Single Booking",
                new Input(new int[][]{{1, 1, 5}}, 1),
                new int[]{5}
            ),
            new TestCase<>(
                "Spanning All Flights Uniform Seats",
                new Input(new int[][]{{1, 4, 10}}, 4),
                new int[]{10, 10, 10, 10}
            ),
            new TestCase<>(
                "Empty Bookings Array All Zeros",
                new Input(new int[][]{}, 3),
                new int[]{0, 0, 0}
            ),
            new TestCase<>(
                "Interior Range Subarray",
                new Input(new int[][]{{2, 3, 7}}, 4),
                new int[]{0, 7, 7, 0}
            ),
            new TestCase<>(
                "Identical Intervals Cumulative Addition",
                new Input(new int[][]{{1, 3, 1}, {1, 3, 2}, {1, 3, 3}}, 3),
                new int[]{6, 6, 6}
            ),
            new TestCase<>(
                "Disjoint Non Overlapping Intervals",
                new Input(new int[][]{{1, 2, 5}, {3, 4, 10}}, 4),
                new int[]{5, 5, 10, 10}
            ),
            new TestCase<>(
                "Entire Range Large Value",
                new Input(new int[][]{{1, 5, 100}}, 5),
                new int[]{100, 100, 100, 100, 100}
            ),
            new TestCase<>(
                "Isolated Point Bookings Sequential",
                new Input(new int[][]{{1, 1, 20}, {2, 2, 30}, {3, 3, 40}}, 3),
                new int[]{20, 30, 40}
            )
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Corporate Flight Bookings (Debug)",
            testCases,
            input -> CorporateFlightBookingsDebug.solve(input.bookings, input.n),
            false
        );
    }
}
