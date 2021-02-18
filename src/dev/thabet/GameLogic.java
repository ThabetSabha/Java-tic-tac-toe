package dev.thabet;

import java.util.Arrays;

public class GameLogic {


    //Creates an array of strings : ['1','2','3','4','5','6','7','8']
    public static String[] createBoard() {
        String[] board = new String[9];
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
        return board;
    }


    //returns the turn
    public static String getTurn(String turn) {
        return turn.equals("X") ? "O" : "X";
    }


    //Applies the last userInput to the board
    public static void applyUserInput(int numInput, String[] board, String turn) {
        board[numInput - 1] = turn;
    }


    public static String checkWinner(String[] board) {
        //Checks the possible winning combinations based on user's input
        for (int a = 0; a < 8; a++) {
            String line = switch (a) {
                case 0 -> board[0] + board[1] + board[2];
                case 1 -> board[3] + board[4] + board[5];
                case 2 -> board[6] + board[7] + board[8];
                case 3 -> board[0] + board[3] + board[6];
                case 4 -> board[1] + board[4] + board[7];
                case 5 -> board[2] + board[5] + board[8];
                case 6 -> board[0] + board[4] + board[8];
                case 7 -> board[2] + board[4] + board[6];
                default -> null;
            };

            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        //Checks for a draw (if there are still numbers in board)
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }
        // In case of no winner and no draw, return null;
        return null;
    }

}
