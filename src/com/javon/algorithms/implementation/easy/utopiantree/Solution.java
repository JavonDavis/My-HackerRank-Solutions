package com.javon.algorithms.implementation.easy.utopiantree;

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
            int height = 1;
            int n = Integer.parseInt(readLine());
            for(int j = 0; j< n; j++ )
            {
                if(j%2 ==0)
                {
                    height *= 2;
                }
                else
                {
                    height += 1;
                }
            }
            System.out.println(height);
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