package com.kodilla.UI;

import java.util.Scanner;

public class GameInstructionsPrinter {

    public static void printSetGameModeText(){

//        System.out.println("Choose Game mode:");
        System.out.println("Please choose a game mode using a corresponding number for a game mode.");
        System.out.println("1: Player vs Player");
        System.out.println("2: Player vs CPU");
    }

    public static void printChosenGameModeInitialization(String gameMode){
        System.out.println("Initializing game: " + gameMode);
    }

    public static void printPlayersInGame(String player1, String player2){
        System.out.println("Players in game: \n" + player1 + "\n" + player2);
    }

    public static void printMessageForUserPositionPlacement(String player){
        System.out.println(player + " - enter your placement (1-9)");
    }
    public static void printMessageForIncorrectInputForPositionPlacement(String player){
        System.out.println("Incorrect input - number required\n" + player + " - enter your placement (1-9)");
    }

}
