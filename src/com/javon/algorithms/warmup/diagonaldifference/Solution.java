package com.javon.algorithms.warmup.diagonaldifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 26/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)
    {
        int n = Integer.parseInt(readLine());
        int i = 0;

        int result = 0;
        while(n>0)
        {
            String line = readLine();

            assert line != null;
            String[] numbers = line.split("\\s");

            result += (Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[n-1]));
            i++;n--;
        }
        System.out.print(Math.abs(result));
    }

    public static String readLine()
    {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
