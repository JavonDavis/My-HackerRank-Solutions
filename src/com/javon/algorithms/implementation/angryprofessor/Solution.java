package com.javon.algorithms.implementation.angryprofessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 26/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        int numCases = Integer.parseInt(readLine());

        for (int i = 0; i<numCases; i++)
        {
            String[] classInfo = readLine().split("\\s");
            String[] arrivalTimes = readLine().split("\\s");

            int n = Integer.parseInt(classInfo[0]);
            int k = Integer.parseInt(classInfo[1]);

            int count = 0;

            for(String time:arrivalTimes)
            {
                int val = Integer.parseInt(time);

                if(val<=0)
                {
                    count++;
                }
            }

            if(count >= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }

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