package io.colosseum.commands;

import io.colosseum.constants.MESSAGES;
import io.colosseum.game.Game;

public abstract class Command {
    private Game game;
    private int ARGUMENT_AMOUNT = 0;
    private boolean USE_OUTSIDE_OF_RUN = false;

    public Command(int ARGUMENT_AMOUNT, boolean USE_OUTSIDE_OF_RUN) {
        this.ARGUMENT_AMOUNT = ARGUMENT_AMOUNT;
        this.USE_OUTSIDE_OF_RUN = USE_OUTSIDE_OF_RUN;
    }

    public Command(int ARGUMENT_AMOUNT) {
        this.ARGUMENT_AMOUNT = ARGUMENT_AMOUNT;
    }

    public Command() {
    }

    public abstract String execute(String[] args);

    public abstract String getCommand();

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String checkIfLegal(String[] args) {
        if (args.length != ARGUMENT_AMOUNT) {
            return MESSAGES.WRONG_INPUT + "Expected " + ARGUMENT_AMOUNT + " arguments but was given "
                    + args.length + ".";
        }
        return null;
    }


}
