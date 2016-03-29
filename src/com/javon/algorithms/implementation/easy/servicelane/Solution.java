package com.javon.algorithms.implementation.easy.servicelane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 28/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        String line = readLine();
        String[] nT = line.split("\\s");

        int n = Integer.parseInt(nT[0]);
        int t = Integer.parseInt(nT[1]);

        line = readLine();
        String[] arrElements = line.split("\\s");

        Integer[] laneRepresentation = stringArrayToIntArray(arrElements);

        for(int i=0; i<t; i++)
        {
            Integer[] entryExit = stringArrayToIntArray(readLine().split("\\s"));
            int entryPoint = entryExit[0];
            int exitPoint = entryExit[1];

            int min = 4;
            for(int j = entryPoint; j<= exitPoint; j++)
            {
                if(min >laneRepresentation[j])
                {
                    min = laneRepresentation[j];
                }
            }

            System.out.println(min);
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

    private static Integer[] stringArrayToIntArray(String[] stringArr)
    {
        Integer[] integerArr = new Integer[stringArr.length];
        for (int i =0; i<stringArr.length; i++)
        {
            integerArr[i] = Integer.valueOf(stringArr[i]);
        }
        return integerArr;
    }
}