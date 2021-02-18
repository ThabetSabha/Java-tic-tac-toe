package dev.thabet;



public class Printer {

    public static void printIntro(String[] board) {
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard(board);
        System.out.println(
                "X will play first. Enter a slot number to place X in:");
    }


    //Draws the board on the console
    static public void printBoard(String[] board) {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");
    }


    // displays the result of the game.
    public static void printResult(String winner) {
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        } else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won!");
        }
    }


    public static void printTurnPrompt(String turn) {
        System.out.println(
                turn + "'s turn. enter a slot number to place "
                        + turn + " in:");
    }

}
