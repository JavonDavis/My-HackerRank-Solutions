package com.javon.rookierank2.minimumAbsoluteDifference;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by javon on 11/02/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);

        int minimumDifference = 1000000000;
        int i = 0;

        while (i < n-1) {
            int difference = Math.abs(a[i] - a[i+1]);
            if(difference < minimumDifference) {
                minimumDifference = difference;
            }
            i++;
        }

        System.out.print(minimumDifference);
    }

}
