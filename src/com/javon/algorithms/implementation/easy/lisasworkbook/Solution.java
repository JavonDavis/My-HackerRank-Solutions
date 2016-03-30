package com.javon.algorithms.implementation.easy.lisasworkbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 29/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Integer[] nk = stringArrayToIntArray(readLine().split("\\s"));

        int n = nk[0];
        int k = nk[1];

        Integer[] pages = stringArrayToIntArray(readLine().split("\\s"));

        int count = 0;
        int page = 1;
        for (int i = 1; i <= n; i++) {

            for(int j = 1; j<= pages[i-1]; j++)
            {
                if(page == j)
                {
                    count++;
                }
                if(j%k == 0)
                {
                    page++;
                }
                else if(j == pages[i-1])
                {
                    page ++;
                }
            }
        }
        System.out.print(count);
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