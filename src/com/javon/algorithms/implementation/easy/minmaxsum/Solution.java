package com.javon.algorithms.implementation.easy.minmaxsum;

import java.util.Scanner;

/**
 * Created by javon on 05/02/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long[] numbers = new long[]{a,b,c,d,e};

        long max = numbers[0];
        long min = numbers[0];
        long sum = 0;

        for(long number : numbers)  {
            if(number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            sum += number;
        }
        System.out.printf("%s %s", sum - max, sum-min);
    }
}
