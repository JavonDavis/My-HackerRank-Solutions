package com.javon.algorithms.warmup.timeconversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 26/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String time = readLine();

        assert time != null;
        if(time.contains("AM"))
        {
            time = time.replace("AM","");
            String hour = time.charAt(0)+""+time.charAt(1);
            int numVal = Integer.parseInt(hour);

            if(numVal == 12)
            {
                System.out.print("00"+time.substring(2));
            }
            else {
                System.out.print(time);
            }

        }
        else
        {
            time = time.replace("PM","");
            String hour = time.charAt(0)+""+time.charAt(1);
            int numVal = Integer.parseInt(hour);

            if(numVal != 12)
            {
                numVal += 12;
            }

            System.out.print(numVal+time.substring(2));
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