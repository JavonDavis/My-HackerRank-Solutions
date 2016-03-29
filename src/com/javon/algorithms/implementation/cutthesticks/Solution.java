package com.javon.algorithms.implementation.cutthesticks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 29/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int n = Integer.parseInt(readLine());

        Integer[] sticks = stringArrayToIntArray(readLine().split("\\s"));

        int threshold = 1001;
        int min = cut(n,threshold,sticks);

        while (min != threshold)
        {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (sticks[i] > 0) {
                    sticks[i] -= min;
                    count++;
                }
            }
            System.out.println(count);
            min = cut(n,threshold,sticks);
        }
    }

    private static int cut(int n,int min, Integer[] sticks)
    {

        for(int i = 0; i<n; i++)
        {
            if(sticks[i] > 0 && sticks[i] < min)
            {
                min = sticks[i];
            }
        }
        return min;
    }

    public static String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Integer[] stringArrayToIntArray(String[] stringArr) {
        Integer[] integerArr = new Integer[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            integerArr[i] = Integer.valueOf(stringArr[i]);
        }
        return integerArr;
    }
}