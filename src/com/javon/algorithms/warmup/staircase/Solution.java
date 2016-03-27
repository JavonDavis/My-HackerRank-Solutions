package com.javon.algorithms.warmup.staircase;

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
        int numHashes = 1;

        for(int numSpaces = n-1; numSpaces >=0; numSpaces--,numHashes++)
        {
            for(int i =0; i<numSpaces; i++)
            {
                System.out.print(" ");
            }
            for (int i =0; i<numHashes;i++)
            {
                System.out.print("#");
            }
            System.out.println();
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