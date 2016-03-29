package com.javon.algorithms.implementation.easy.sherlockbeast;

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

        for(int i = 0;i<numCases; i++)
        {
            int n = Integer.parseInt(readLine());

            int count = 0;
            String result ="-1";

            if(n%3 == 0)
            {
                result = new String(new char[n/3]).replace("\0", "555");
            }
            else {

                while (n > 0) {
                    n -= 5;
                    count++;
                    if (n > 0 && n % 3 == 0) {
                        result = new String(new char[n / 3]).replace("\0", "555");
                        result += (new String(new char[count]).replace("\0", "33333"));
                        break;
                    }
                }

                if(n==0)
                {
                    result = new String(new char[count]).replace("\0", "33333");
                }
            }
            System.out.println(result);
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