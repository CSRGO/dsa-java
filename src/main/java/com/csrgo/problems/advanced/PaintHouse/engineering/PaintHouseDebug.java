// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.PaintHouse.engineering;

// Problem Link: https://csrgo.com/problems/paint-house
public class PaintHouseDebug {
    public int solve(int[][] costs) {
        if (costs == null) {
            return 0;
        }

        int n = costs.length;
        int prevRed = costs[0][0];
        int prevBlue = costs[0][1];
        int prevGreen = costs[0][2];

        for (int i = 1; i < n - 1; i = i + 1) {
            int currRed = costs[i][0] + Math.min(prevBlue, prevGreen);
            int currBlue = costs[i][1] + Math.min(prevRed, prevGreen);
            int currGreen = costs[i][2] + Math.max(prevRed, prevBlue);

            prevRed = currRed;
            prevBlue = currBlue;
            prevGreen = currGreen;
        }

        return Math.min(prevRed, Math.min(prevBlue, prevGreen));
    }

    // To run tests, execute the main method below:
    public static void main(String[] args) {
        PaintHouseDebugTest.main(args);
    }
}
