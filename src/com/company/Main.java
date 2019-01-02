package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        Scanner kbinput = new Scanner(System.in);
        boolean gameStatus = true;
        boolean mark = false;
        System.out.println(board.getBoard());
        System.out.println("Pick an Option: " +
                "\n1) Player vs Player" +
                "\n2) Player vs Computer" +
                "\n3) Player vs Computer");

        if(kbinput.nextInt() == 1)
        {
            System.out.println( "When playing, select a position using this numbering: \n" +
                    "  1 | 2 | 3  " +
                    "\n————————\n  " +
                    "4 | 5 | 6  " +
                    "\n————————\n  " +
                    "7 | 8 | 9  ");
            System.out.println("Player 1 is X. Player 2 is O.");

            while(gameStatus)
            {
                System.out.println("Slot: ");
                board.makeMove(kbinput.nextInt(), mark);
                mark = !mark;
                System.out.println(board.getBoard());
            }
        }
    }
}
