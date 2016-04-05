package com.javon.algorithms.implementation.easy.caesarcipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 04/04/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int n = Integer.parseInt(readLine());

        String message = readLine();

        int k = Integer.parseInt(readLine());

        for(int i = 0; i< n;i++) {
            int letter = message.charAt(i);

            if (letter >= 65 && letter <= 90) {
                letter += k;
                while (letter > 90) {
                    letter -= 26;
                }
            }
            if (letter >= 97 && letter <= 122) {
                letter += k;
                while (letter > 122) {
                    letter -= 26;
                }
            }
            System.out.print((char) letter);
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