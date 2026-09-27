// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PaintFence.engineering;

// Problem Link: https://csrgo.com/problems/paint-fence
public class PaintFenceDebug {
    public int solve(int n, int k) {
        if (n == 0 || k == 0) {
            return 1;
        }
        if (n == 1) {
            return k;
        }

        int same = k;
        int diff = k * k;

        for (int i = 3; i <= n; i = i + 1) {
            int newSame = diff;
            int newDiff = (same + diff) * k;

            same = newSame;
            diff = newDiff;
        }

        return same + diff;
    }

    // To run tests, execute the main method below:
    public static void main(String[] args) {
        PaintFenceDebugTest.main(args);
    }
}
