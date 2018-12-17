package com.company;

public class Main {

    public static void main(String[] args) {

        String[][] Dan = new String[9][9];

        for (int i = 1; i < 7; i++)
        {
            for (int i2 = 0; i2 < 9; i2++)
            {
                Dan[i][i2] = "▨";
            }
            i++;
        }

        for (int i = 1; i < 7; i++)
        {
            for (int i2 = 0; i2 < 9; i2++)
            {
                System.out.print(Dan[i][i2]);
            }
            System.out.println();
            i++;
        }
    }
}
