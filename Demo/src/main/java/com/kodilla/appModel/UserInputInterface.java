package com.kodilla.appModel;

import java.util.Scanner;

import static com.kodilla.UI.GameInstructionsPrinter.*;

public class UserInputInterface {
    static Scanner scan;

    public static String setGameMode(){
        int input;
        scan = new Scanner(System.in);

        do {
            printSetGameModeText();
            while (!scan.hasNextInt()) {
                printSetGameModeText();
                scan.next();
            }
            input = scan.nextInt();
        } while (input >2 || input <1);

        return input == 1? "Player vs Player":"Player vs CPU";
    }

    public static int enterPositionPlacement(String player) {
        int input;
        scan = new Scanner(System.in);

        do {
            printMessageForUserPositionPlacement(player);
            while (!scan.hasNextInt()) {
                printMessageForIncorrectInputForPositionPlacement(player);
                scan.next();
            }
            input = scan.nextInt();

        } while (input >9 || input <1);

        return input;
    }
}
