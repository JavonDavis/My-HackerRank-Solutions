package com.javon.rookierank2.hackerrankInAString;

import java.util.Scanner;

/**
 * Created by javon on 11/02/2017.
 */
public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            char[] letters = new char[] {'h','a','c','k','e','r','r','a','n','k'};
            int letterIndex = 0;
            boolean foundHackerRank = false;
            String s = in.next();
            for(char letter: s.toCharArray()) {
                if(letter == letters[letterIndex]) {
                    letterIndex++;
                }
                if(letterIndex == 10) {
                    foundHackerRank = true;
                    break;
                }
            }
            if(foundHackerRank) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}
