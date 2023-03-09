package com.kodilla;

import com.kodilla.appModel.CPUInterface;
import com.kodilla.appModel.DataStorer;
import com.kodilla.appModel.GameSettings;
import com.kodilla.appModel.UserInputInterface;

import java.util.List;

import static com.kodilla.UI.GameInstructionsPrinter.printChosenGameModeInitialization;
import static com.kodilla.UI.GameInstructionsPrinter.printPlayersInGame;
import static com.kodilla.appModel.DataStorer.cpuMakesMove;
import static com.kodilla.appModel.DataStorer.playerMakesMove;
import static com.kodilla.appModel.UserInputInterface.enterPositionPlacement;

public class GameRunner {

    private GameSettings gameSettings;
    private DataStorer gameData;


    public GameRunner() {
        gameData = new DataStorer();
        gameSettings = new GameSettings();

        initializeGame();
        runGame();
    }


    private void runGame() {
        System.out.println("Starting Game:");

        String player1 = gameSettings.getPlayer1();
        String player2 = gameSettings.getPlayer2();

        if (gameSettings.getGameMode() == "Player vs Player") {
            while (true) {
                if(executePlayerMove(player1))
                    break;

                if(executePlayerMove(player2))
                    break;
            }
        } else {
            while (true) {
                if(executePlayerMove(player1))
                    break;
                if(executeCPUMove(player2))
                    break;
            }
        }
    }

    private boolean executePlayerMove(String player) {

        int input = enterPositionPlacement(player);

        while (!gameData.checkIfPositionIsAvailable(input)) {
            System.out.println("Chosen position is not available. Please choose a new one.");
            input = enterPositionPlacement(player);
        }
        gameData.addPositionToList(player, input);
        playerMakesMove(input, player);

        return gameData.checkWinningConditions(player);

    }

    private boolean executeCPUMove(String player) {

        int input = CPUInterface.generatePosition();

        while (!gameData.checkIfPositionIsAvailable(input)) {
            System.out.println("CPU has chosen a taken position - " + input +". Rolling again");
            input = CPUInterface.generatePosition();
        }

        gameData.addPositionToList(player, input);
        cpuMakesMove(input, player);

        return gameData.checkWinningConditions(player);

    }

    private void initializeGame() {
        gameSettings.setGameMode(UserInputInterface.setGameMode());
        printChosenGameModeInitialization(gameSettings.getGameMode());

        gameSettings.setPlayers(gameSettings.getGameMode());
        printPlayersInGame(gameSettings.getPlayer1(), gameSettings.getPlayer2());
    }
}
