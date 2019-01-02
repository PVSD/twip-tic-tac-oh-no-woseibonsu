package com.company;

public class Board {

    char[][] board = new char[3][3];

    public Board() {}

    public void makeMove(int slot, boolean charcter)
    {
        int column;
        char mark;

        //DECIDES WHICH MARK TO USE
        if(charcter)
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

    public String getBoard()
    {
        return  
                "  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "  " +
                "\n————————\n " +
                " " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "  " +
                "\n————————\n " +
                " " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "  ";
    }
}
