package com.kodilla.appModel;

import com.kodilla.UI.DisplayGameBoard;

public class GameBoard {

   public static char[][] gameBoard = {{'|', ' ', '|', ' ', '|', ' ', '|'},
            {'|', ' ', '|', ' ', '|', ' ', '|'},
            {'|', ' ', '|', ' ', '|', ' ', '|'}};

    public char[][] getGameBoard() {
        return gameBoard;
    }

    public static void makeMove(int position, char symbol ){

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
            default:
                break;

        }
        DisplayGameBoard.printGameBoard(gameBoard);
    }

    public static void makeMove(int position, String player ){
        char symbol = UserInputInterface.getSymbol(player);

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
            default:
                break;

        }
        DisplayGameBoard.printGameBoard(gameBoard);
    }
}
