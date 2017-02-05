package com.javon.algorithms.warmup.comparethetriplets;

import java.util.Scanner;

/**
 * Created by javon on 04/02/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        String result = calculateScore(a0, a1, a2, b0, b1, b2);

        System.out.print(result);
    }

    private static String calculateScore(int a0, int a1, int a2, int b0, int b1, int b2) {
        int bobScore = 0;
        int aliceScore = 0;

        if(a0 > b0) {
            aliceScore += 1;
        } else if (a0 < b0) {
            bobScore += 1;
        }

        if(a1 > b1) {
            aliceScore += 1;
        } else if (a1 < b1) {
            bobScore += 1;
        }

        if(a2 > b2) {
            aliceScore += 1;
        } else if (a2 < b2) {
            bobScore += 1;
        }

        String resultString = String.format("%s %s", aliceScore, bobScore);
        return resultString;
    }
}
