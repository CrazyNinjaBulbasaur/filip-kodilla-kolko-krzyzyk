package com.kodilla.appModel;

import java.util.Scanner;

import static com.kodilla.appModel.GameBoard.makeMove;

public class UserInputInterface {
    static Scanner scan;

    public static void enterPositionPlacement() {
        scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9)");
        int position = scan.nextInt();

        makeMove(position, 'X');
    }

    public static void enterPositionPlacement(String player) {
        scan = new Scanner(System.in);
        System.out.println(player + " - enter your placement (1-9)");
        int position = scan.nextInt();

//        DataStorer.addPositionToList(player, position);
        makeMove(position, getSymbol(player));
    }

    public static String setGameMode(){
        String playerVSPLayer = "Player vs Player";
        String playerVSCPU = "Player vs CPU";

        scan = new Scanner(System.in);
        System.out.println("Choose Made mode:");
        System.out.println("1: " + playerVSPLayer);
        System.out.println("2: " + playerVSCPU);

        int input = scan.nextInt();

        return input == 1? playerVSPLayer:playerVSCPU;
    }

    public static char getSymbol(String user){

        char symbol = ' ';

        if(user.equals("player1")){
            symbol = 'X';
        }else if (user.equals("CPU") || user.equals("player2")){
            symbol = '0';
        }

        return symbol;
    }


}
