package com.javon.algorithms.implementation.easy.cavitymap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by javon on 01/04/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int n = Integer.parseInt(readLine());

        Integer[][] grid = new Integer[n][n];
        ArrayList<String> numbers = new ArrayList<String>();
        for(int row = 0; row< n; row++)
        {
            String number = readLine();
            assert number != null;
            numbers.add(number);
            for (int column = 0; column< n; column++)
            {
                grid[row][column] = Integer.valueOf(String.valueOf(number.charAt(column)));
            }
        }

        ArrayList<Integer[]> validPositions = new ArrayList<Integer[]>();
        for(int row = 0; row< n; row++)
        {
            for (int column = 0; column< n; column++)
            {
                if(row + 1 < n && column +1 < n && row - 1 >= 0 && column -1 >= 0) {
                    boolean valid = false;
                    int num = grid[row][column];

                    if (num > grid[row][column - 1] && num > grid[row - 1][column]
                            && num > grid[row][column + 1] && num > grid[row + 1][column]) {
                        valid = true;
                    }

                    if (valid) {
                        validPositions.add(new Integer[]{row, column});
                    }
                }
            }
        }

        for(int j = 0; j< n; j++)
        {

            String number = numbers.get(j);
            char[] characters = number.toCharArray();
            for(int i = 0; i<characters.length; i++)
            {
                boolean found = false;
                for(Integer[] position: validPositions) {
                    if (j == position[0] && i == position[1]) {
                        System.out.print("X");
                        found = true;
                        break;
                    }
                }
                if(!found)
                {
                    System.out.print(characters[i]);
                }
            }
            System.out.println();
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