package com.javon.algorithms.strings.camelCase;

import java.util.Scanner;

/**
 * Created by javon on 06/02/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int wordCount = 1;

        for(int i =0; i <s.length(); i++) {
            char letter = s.charAt(i);

            if(letter < 97) {
                wordCount++;
            }
        }

        System.out.print(wordCount);
    }
}
