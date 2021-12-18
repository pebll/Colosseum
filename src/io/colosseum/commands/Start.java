package io.colosseum.commands;

import io.colosseum.game.Game;

public class Start extends Command{

    @Override
    public String execute(String[] args) {
      Game game = getGame();
      game.initialize();

      return "Game started :)";
    }

    @Override
    public String getCommand() {
        return "start";
    }
}
