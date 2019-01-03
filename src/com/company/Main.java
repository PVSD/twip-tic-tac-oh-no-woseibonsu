package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        Scanner kbinput = new Scanner(System.in);
        boolean gameStatus = true;
        boolean mark = false;


        System.out.print("Pick an Option: " +
                "\n1) Player vs Player" +
                "\n2) Player vs Computer" +
                "\n3) Computer vs Computer" +
                "\nOption: ");

        if(kbinput.nextInt() == 1)
        {
            Board.getExample();
            System.out.println("Player 1 is X. Player 2 is 0.");

            while(gameStatus)
            {
                System.out.print("Slot: ");
                try
                {
                    int slot = kbinput.nextInt();
                    if (board.checkMovement(slot)) {
                        board.makeMove(slot, mark);
                        mark = !mark;
                        board.getBoard();
                    } else {
                        System.out.println("That spot is taken. Try again.\n");
                    }
                } catch (InputMismatchException e)
                {
                    String slot = kbinput.next();
                    if (slot.toLowerCase().equals("example"))
                        Board.getExample();
                    else
                        System.out.println("That's not a proper input. Try again.");
                }


            }
        }
    }
}
