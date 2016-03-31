package com.javon.algorithms.implementation.moderate.thegridsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by javon on 31/03/2016.
 */
public class Solution {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int numCases = Integer.parseInt(readLine());

        for (int i = 0; i < numCases; i++) {
            Integer[] rc = stringArrayToIntArray(readLine().split("\\s"));
            int rows = rc[0];
            int columns = rc[1];

            int gridRows = rows;
            int gridColumns = columns;

            Integer[][] grid = new Integer[rows][columns];
            for(int row = 0; row<rows; row++)
            {
                String number = readLine();
                for (int column = 0; column<columns; column++)
                {
                    assert number != null;
                    grid[row][column] = Integer.valueOf(String.valueOf(number.charAt(column)));
                }
            }

            rc = stringArrayToIntArray(readLine().split("\\s"));

            rows = rc[0];
            columns = rc[1];

            Integer[][] gridQuery = new Integer[rows][columns];
            for(int row = 0; row<rows; row++)
            {
                String number = readLine();
                for (int column = 0; column<columns; column++)
                {
                    assert number != null;
                    gridQuery[row][column] = Integer.valueOf(String.valueOf(number.charAt(column)));
                }
            }
            boolean found = true;
            rowCount:
            for(int row = 0; row< gridRows; row++)
            {
                for(int column = 0; column<gridColumns; column++)
                {
                    if(row + rows <= gridRows && column + columns <= gridColumns) {
                        found = true;
                        queryCount:
                        for(int queryRow = 0; queryRow<rows; queryRow++)
                        {
                            for(int queryColumn = 0; queryColumn<columns; queryColumn++)
                            {
                                if (!gridQuery[queryRow][queryColumn].equals(grid[row+queryRow][column+queryColumn])) {
                                    found = false;
                                    break queryCount;
                                }
                            }
                        }

                        if(found)
                            break rowCount;
                    }

                }
            }

            if(found)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
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

    public static Integer[] stringArrayToIntArray(String[] stringArr) {
        Integer[] integerArr = new Integer[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            integerArr[i] = Integer.valueOf(stringArr[i]);
        }
        return integerArr;
    }
}