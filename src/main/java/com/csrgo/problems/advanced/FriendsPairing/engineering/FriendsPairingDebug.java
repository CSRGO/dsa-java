// Copyright (c) 2026 CSRGO DSA. All rights reserved.

package com.csrgo.problems.advanced.FriendsPairing.engineering;

// Problem Link: https://csrgo.com/problems/friends-pairing
public class FriendsPairingDebug {
    public long solve(int n) {
        if (n <= 1) {
            return 1L;
        }
        if (n == 2) {
            return 2L;
        }

        long prev2 = 1L;
        long prev1 = 2L;

        for (int i = 3; i < n; i = i + 1) {
            long current = prev1 + (long) i * prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    // To run tests, execute the main method below:
    public static void main(String[] args) {
        FriendsPairingDebugTest.main(args);
    }
}
