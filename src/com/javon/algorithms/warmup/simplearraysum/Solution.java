package com.javon.algorithms.warmup.simplearraysum;

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
        int numberOfNumbers = Integer.parseInt(readLine());

        String line = readLine();

        assert line != null;
        String[] numbers = line.split("\\s");

        int sum = 0;
        for(int i =0; i<numberOfNumbers; i++)
        {
            sum+= Integer.parseInt(numbers[i]);
        }

        System.out.print(sum);
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
