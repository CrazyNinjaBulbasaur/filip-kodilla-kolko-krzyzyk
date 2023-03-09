package com.kodilla.appModel;

import java.util.List;

public class GameRunner {

    private String gameMode;

    private String player1;
    private String player2;

    DataStorer gameData;


    public GameRunner() {
        this.gameMode = UserInputInterface.setGameMode();
//        gameData = new DataStorer();
//        System.out.println("Initializing mode: " + gameMode);
//        setPlayers(this.gameMode);
//        System.out.println("Players in game: \n" + player1 + "\n" + player2);
//
//        runGame();
    }

    private void setPlayers(String gameMode){
        if(gameMode == "Player vs Player"){
            player1 = "player1";
            player2 = "player2";
        }else {
            player1 = "player1";
            player2 = "CPU";
        }
    }

    private void runGame(){
        System.out.println("Starting Game");


        if(gameMode == "Player vs Player"){
            while(true){
                UserInputInterface.enterPositionPlacement(player1);
                checkWinningConditions();
                UserInputInterface.enterPositionPlacement(player2);
                checkWinningConditions();
            }
        }else {
            while(true){
                UserInputInterface.enterPositionPlacement(player1);
                checkWinningConditions();
                CPUInterface.cpuMakesMove(player2, CPUInterface.generatePosition());
                checkWinningConditions();
            }
        }
    }

    /**
     * To re-write (not flexible)
     */
    private void checkWinningConditions(){
        for (List list : gameData.getWinningConditions()){
            if(gameData.getPlayer1Position().containsAll(list)){
                System.out.println("Player1 - you won");
                return;
            }else if(gameData.getPlayer2Position().containsAll(list)){
                System.out.println("Player 2 / CPU - you won");
            }else if(gameData.getPlayer2Position().size() + gameData.getPlayer2Position().size() == 9){
                System.out.println("TIE!");
            }
        }
    }
}
