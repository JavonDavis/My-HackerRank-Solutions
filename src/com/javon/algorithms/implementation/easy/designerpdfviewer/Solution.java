package com.javon.algorithms.implementation.easy.designerpdfviewer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by javon on 05/02/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }

        String word = in.next();
        int maxHeight = 0;
        int wordLength = word.length();
        for(int i =0;i< wordLength; i ++) {
            char letter = word.charAt(i);
            int index = letter - 97; // the asci value of 'a'

            if(h[index] > maxHeight) {
                maxHeight = h[index];
            }
        }

        System.out.print(maxHeight*wordLength);
    }
}
