package io.colosseum.ui;

import io.colosseum.game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        CommandManager manager = new CommandManager(game);
        manager.run();
    }
}
