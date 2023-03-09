package com.kodilla.UI;

import com.kodilla.appModel.GameBoard;

public class DisplayGameBoard {

    public static void main(String[] args) {

        char[][] gameBoard = new GameBoard().getGameBoard();



        printGameBoard(gameBoard);
        System.out.println();
        testingPositions(gameBoard);

    }
    public static void printGameBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for(char cell : row){
                System.out.print(cell);
            }
            System.out.println();
        }
    }








    public static void printGameBoardAfterMove(char[][] gameBoard, int position, char symbol ){

        switch(position) {
            case 1:
                gameBoard[0][1] = symbol;
                break;
            case 2:
                gameBoard[0][3] = symbol;
                break;
            case 3:
                gameBoard[0][5] = symbol;
                break;
            case 4:
                gameBoard[1][1] = symbol;
                break;
            case 5:
                gameBoard[1][3] = symbol;
                break;
            case 6:
                gameBoard[1][5] = symbol;
                break;
            case 7:
                gameBoard[2][1] = symbol;
                break;
            case 8:
                gameBoard[2][3] = symbol;
                break;
            case 9:
                gameBoard[2][5] = symbol;
                break;
        }
        printGameBoard(gameBoard);
    }

    private static void testingPositions(char[][] gameBoard){

        for (int i = 0; i<= 9; i++) {
            System.out.println("Testing position: " + i);
            printGameBoardAfterMove(gameBoard, i, 'X');
        }
    };
}
