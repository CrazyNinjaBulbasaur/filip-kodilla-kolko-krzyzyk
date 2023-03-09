package com.kodilla.appModel;

import com.kodilla.UI.DisplayGameBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.kodilla.appModel.GameSettings.getSymbol;

public class DataStorer {

    public static char[][] gameBoard = {{'|', ' ', '|', ' ', '|', ' ', '|'},
            {'|', ' ', '|', ' ', '|', ' ', '|'},
            {'|', ' ', '|', ' ', '|', ' ', '|'}};

    private List<Integer> player1Positions;
    private List<Integer> player2Positions;

    private List<List> winningConditions;

    public DataStorer() {
        winningConditions = initWinningConditions();
        player1Positions = new ArrayList<>();
        player2Positions = new ArrayList<>();
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

        ArrayList<List> winningConditions = new ArrayList<>();

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

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


    public boolean checkIfPositionIsAvailable(int position){
        boolean isAvailable = getPlayer1Position().contains(position) || getPlayer2Position().contains(position);

        return !isAvailable;

    }

    public boolean checkWinningConditions(String player) {
        for (List list : getWinningConditions()) {
            if (getPlayer1Position().containsAll(list)) {
                System.out.println(player + " won");
                return true;
            } else if (getPlayer2Position().containsAll(list)) {
                System.out.println(player +  " won");
                return true;
            } else if (getPlayer2Position().size() + getPlayer2Position().size() == 9) {
                System.out.println("TIE!");
                return true;
            }
        }
        return false;
    }

    public static void playerMakesMove(int position, String player ){

        makeMove(position,getSymbol(player));
    }

    public static void cpuMakesMove(int position, String player){
        makeMove(position,getSymbol(player));
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
}
