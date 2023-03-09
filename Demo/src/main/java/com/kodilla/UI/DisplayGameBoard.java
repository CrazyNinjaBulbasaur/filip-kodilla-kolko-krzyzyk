package com.kodilla.UI;


public class DisplayGameBoard {

    public static void printGameBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for(char cell : row){
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
