package com.javon.algorithms.implementation.sherlocksquares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 27/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int numCases = Integer.parseInt(readLine());

        for (int i = 0; i < numCases; i++) {
            String[] line = readLine().split("\\s");

            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            int num = (int) Math.sqrt(a);
            int count = 0;
            while (Math.pow(num, 2) <= b)
            {
                if(Math.pow(num,2) >= a)
                {
                    count++;
                }
                num++;
            }
            System.out.println(count);
        }
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