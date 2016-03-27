package com.javon.algorithms.warmup.plusminus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 26/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        int n = Integer.parseInt(readLine());

        String[] numbers = readLine().split("\\s");

        float positives = 0;
        float negatives = 0;
        float zeroes = 0;

        for(int i = 0;i<n;i++)
        {
            int ai = Integer.parseInt(numbers[i]);
            if(ai > 0)
            {
                positives += 1;
            }
            else if(ai ==0)
            {
                zeroes += 1;
            }
            else
            {
                negatives += 1;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f",positives/n,negatives/n,zeroes/n);
    }

    public static String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}