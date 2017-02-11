package com.javon.rookierank2.migratoryBirds;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by javon on 11/02/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<Integer, Integer> typeValues = new HashMap<Integer, Integer>();

        typeValues.put(1,0);
        typeValues.put(2,0);
        typeValues.put(3,0);
        typeValues.put(4,0);
        typeValues.put(5,0);

        int maxOccurrences = 0;
        int mode = 1;

        for(int types_i=0; types_i < n; types_i++){
            int type = in.nextInt();
            int numberOfOcurrences = typeValues.get(type);
            numberOfOcurrences++;
            typeValues.put(type, numberOfOcurrences);
            if(numberOfOcurrences > maxOccurrences) {
                maxOccurrences = numberOfOcurrences;
                mode = type;
            } else if(numberOfOcurrences == maxOccurrences){
                if(type < mode) {
                    mode = type;
                }
            }
        }

        System.out.print(mode);
    }
}
