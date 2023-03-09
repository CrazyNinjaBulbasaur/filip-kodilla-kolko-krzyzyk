package com.kodilla.appModel;

import java.util.Random;

public class CPUInterface {

    public static int generatePosition(){
        Random random = new Random();
        int position = random.nextInt(9)+1;
        System.out.println("CPU makes a move: " + position);

        return position;
    }
}
