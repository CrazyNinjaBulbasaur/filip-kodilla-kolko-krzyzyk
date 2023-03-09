package com.kodilla.appModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class DataStorer {

    private List<Integer> player1Positions = new ArrayList<>();
    private List<Integer> player2Positions = new ArrayList<>();

    private List<List> winningConditions;

    public DataStorer() {
        winningConditions = initWinningConditions();
    }
    public void addPositionToList(String player, int position){

        if (player == "player1"){
            player1Positions.add(position);
        } else {
            player2Positions.add(position);
        }

    }

    public  List<List> getWinningConditions() {
        return winningConditions;
    }

    public List<Integer> getPlayer1Position() {
        return player1Positions;
    }

    public List<Integer> getPlayer2Position() {
        return player2Positions;
    }

    public ArrayList<List> initWinningConditions(){

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        ArrayList<List> winningConditions = new ArrayList<>();

        winningConditions.add(topRow);
        winningConditions.add(midRow);
        winningConditions.add(botRow);
        winningConditions.add(leftCol);
        winningConditions.add(midCol);
        winningConditions.add(rightCol);
        winningConditions.add(cross1);
        winningConditions.add(cross2);

        return winningConditions;
    }

}
