package com.javon.algorithms.implementation.easy.chocolatefeast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 29/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int numCases = Integer.parseInt(readLine());

        for (int i = 0; i < numCases; i++) {
            String line = readLine();
            String[] vals = line.split("\\s");
            int n = Integer.parseInt(vals[0]);
            int c = Integer.parseInt(vals[1]);
            int m = Integer.parseInt(vals[2]);

            int wrappers = n/c;

            int chocolate_with_wrappers = wrappers/m;

            int total = wrappers + chocolate_with_wrappers;
            wrappers = chocolate_with_wrappers + wrappers %m;
            while(wrappers >= m)
            {
                chocolate_with_wrappers = wrappers/m;
                total += chocolate_with_wrappers;
                wrappers = chocolate_with_wrappers + wrappers %m;
            }

            System.out.println(total);
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