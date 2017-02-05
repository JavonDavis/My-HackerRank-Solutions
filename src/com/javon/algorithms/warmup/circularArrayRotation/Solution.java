package com.javon.algorithms.warmup.circularArrayRotation;

import java.util.Scanner;

/**
 * Created by javon on 04/02/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];

        int startIndex = 0;

        k %= n;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a_i == (n - k))
                startIndex =a_i;
        }

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();

            m += startIndex;
            m%=n;
            System.out.println(a[m]);
        }
    }
}
