package io.colosseum.ui;

import io.colosseum.commands.Command;
import io.colosseum.game.Game;

import java.util.Scanner;

public class CommandManager {
    private final String COMMAND_QUIT = "quit";
    private final Command[] commands = {};
    boolean quit;

    CommandManager(Game game){
        for (Command command : commands) {
            command.setGame(game);
        }
    }

    public void run() {
        quit = false;
        Scanner scanner = new Scanner(System.in);
        String fullCommandText;
        String[] splitCommand; // 0: command, 1..n : arguments

        while (!quit) {
            fullCommandText = scanner.nextLine();
            splitCommand = fullCommandText.split(" ");

            executeCommand(splitCommand);
        }
        scanner.close();
    }

    public Command getCommand(String commandText) {
        if (commandText.equals(COMMAND_QUIT)) {
            quit = true;
        } else {
            for (Command command : commands) {
                if (command.getCommand().equals(commandText))
                    return command;
            }
        }
        return null;
    }

    public void executeCommand(String[] splitCommand) {
        Command command = getCommand(splitCommand[0]);
        String[] args = new String[splitCommand.length - 1];
        for(int i = 0; i < splitCommand.length - 1; i++){
            args[i] = splitCommand[i+1];
        }
        if (!quit) {
            if (command == null) {
                System.out.println("Command not recognized");
            } else{
                String message = command.execute(args);
                if(message != null)
                    System.out.println(message);
            }

        }
    }
}
