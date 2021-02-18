package dev.thabet;

import java.util.Scanner;

public class InputHandler {


    // Gets input from user, checks if it's an Int b/n 1 and 9, then checks if it's already in the board.
    public static int getValidUserInput(Scanner scanner, String[] board) {
        while (true) {
            int numInput;

            try {

                numInput = Integer.parseInt(scanner.nextLine());
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Invalid input, re-enter slot number:");
                    continue;
                }

            } catch (Exception e) {
                System.out.println(
                        "Invalid input, re-enter slot number:");
                continue;
            }


            if (isNumberTaken(board, numInput)) {
                System.out.println(
                        "Slot already taken, re-enter slot number:");
            } else {
                System.out.println("");
                return numInput;
            }

        }
    }


    //Checks that userInput hasn't been used yet (if it exists in board at input - 1).
    private static boolean isNumberTaken(String[] board, int numInput) {
        return !(board[numInput - 1].equals(String.valueOf(numInput)));
    }


}
