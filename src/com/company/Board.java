package com.company;

public class Board {

    char[][] board = new char[][]
            {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };
    int[][] magicSquare = new int[][]
            {
                    {4, 9, 2},
                    {3, 5, 7},
                    {8, 1, 6}
            };

    public Board() {}

    public void makeMove(int slot, boolean character)
    {
        int column;
        char mark;

        //DECIDES WHICH MARK TO USE
        if(character)
            mark = '0';
        else
            mark = 'X';
        //DECIDES WHICH COLUMN TO PLACE MARK
        if(slot == 1 || slot == 4 || slot == 7 )
            column = 0;
        else if(slot == 2 || slot == 5 || slot == 8 )
            column = 1;
        else
            column = 2;

        //PLACES MARK ON BOARD

        if(slot <= 3)
            board[0][column] = mark;
        else if(slot <= 6)
            board[1][column] = mark;
        else
            board[2][column] = mark;
    }

    public void getBoard()
    {
        System.out.println(
                "\n  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "  " +
                "\n————————\n " +
                " " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "  " +
                "\n————————\n " +
                " " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "  \n");
    }

    public boolean checkMovement(int slot)
    {
        int column;
        int row;

        //FINDS COLUMN POSITION
        if(slot == 1 || slot == 4 || slot == 7 )
            column = 0;
        else if(slot == 2 || slot == 5 || slot == 8 )
            column = 1;
        else
            column = 2;

        //FINDS ROW POSITION
        if(slot <= 3)
            row = 0;
        else if(slot <= 6)
            row = 1;
        else
            row = 2;

        //CHECKS IF THERE IS A BLANK SPACE AT SAID COORDINATE
        if (board[row][column] == ' ')
            return true;
        else
            return false;
    }

    public static void getExample ()
    {
        System.out.println("\nWhen playing, select a position using this numbering: \n" +
                "  1 | 2 | 3  " +
                "\n————————\n  " +
                "4 | 5 | 6  " +
                "\n————————\n  " +
                "7 | 8 | 9  \n" +
            "Type \"Example\" to see it again.\n");
    }
}
