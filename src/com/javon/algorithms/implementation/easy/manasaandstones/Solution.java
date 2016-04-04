package com.javon.algorithms.implementation.easy.manasaandstones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by javon on 03/04/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int numCases = Integer.parseInt(readLine().trim());

        for (int i = 0; i < numCases; i++) {
            int n = Integer.parseInt(readLine().trim());
            int num1 = Integer.parseInt(readLine().trim());
            int num2 = Integer.parseInt(readLine().trim());

            int a = Math.min(num1,num2);
            int b = Math.max(num1,num2);

            int maximum = b*(n-1);
            int difference = Math.max(a,b)- Math.min(a,b);

            int start = a*(n-1);
            if(a == b)
            {
                System.out.println(start);
            }
            else {
                while (start <= maximum) {
                    System.out.print(start + " ");
                    start += difference;
                }
                System.out.println();
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