package com.javon.algorithms.implementation.finddigits;

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

        for(int i = 0; i< numCases; i++)
        {
            String numString = readLine();
            int number = Integer.parseInt(numString);

            int count = 0;
            for(char digitChar: numString.toCharArray())
            {
                int digit = Integer.parseInt(String.valueOf(digitChar));
                if(digit != 0 && number % digit == 0)
                {
                    count++;
                }
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