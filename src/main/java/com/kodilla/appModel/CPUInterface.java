package com.kodilla.appModel;

import java.util.Random;

import static com.kodilla.appModel.GameBoard.makeMove;
import static com.kodilla.appModel.UserInputInterface.getSymbol;

public class CPUInterface {

    public static void cpuMakesMove(String player, int position){
//        DataStorer.addPositionToList(player, position);
        makeMove(position, getSymbol(player));
    };

    public static int generatePosition(){
        Random random = new Random();
        int position = random.nextInt(9)+1;
        System.out.println("CPU makes a move: " + position);

        return position;
    }
}
