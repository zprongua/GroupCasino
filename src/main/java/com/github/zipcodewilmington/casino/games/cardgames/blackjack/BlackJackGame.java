package com.github.zipcodewilmington.casino.games.cardgames.blackjack;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.IOConsole;

public abstract class BlackJackGame extends IOConsole implements GameInterface {

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {
        int numPlayers = getIntegerInput("How many players? (1 or 2)");
        if (numPlayers==1) {
            BlackJackSingle.runBJ();
        }
        else if (numPlayers==2) {
            BlackJackDouble.runBJ();
        }
    }

    @Override
    public void printRules() {

    }

    @Override
    public void playAgain() {

    }
}
