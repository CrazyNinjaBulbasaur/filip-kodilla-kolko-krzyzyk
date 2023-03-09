package com.kodilla.appModel;

public class GameSettings {

    private String gameMode;
    private String player1;
    private String player2;

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getGameMode() {
        return gameMode;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
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

    public void setPlayers(String gameMode) {
        if (gameMode == "Player vs Player") {
            player1 = "player1";
            player2 = "player2";
        } else {
            player1 = "player1";
            player2 = "CPU";
        }
    }
}
