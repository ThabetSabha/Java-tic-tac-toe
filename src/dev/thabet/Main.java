package dev.thabet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] board = GameLogic.createBoard();
        String winner = null;
        String turn = "X";

        //Prints the intro screen to console
        Printer.printIntro(board);

        //while winner is not decided, do these steps.
        while (winner == null) {

            //handles input validation
            int numInput = InputHandler.getValidUserInput(scanner, board);

            //Applies userInput to the board.
            GameLogic.applyUserInput(numInput, board, turn);

            // Checks whose turn it's supposed to be.
            turn = GameLogic.getTurn(turn);

            //prints the board.
            Printer.printBoard(board);

            //CheckWinner either returns null (No Winner), "Draw", or name of winner.
            winner = GameLogic.checkWinner(board);

            //if still no winner print the turn prompt.
            if (winner == null) {
                Printer.printTurnPrompt(turn);
            }
        }
        //Prints the result of the game.
        Printer.printResult(winner);
    }
}
