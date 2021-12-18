package io.colosseum.game;

import io.colosseum.objects.Character;

/**
 * Describes a Colosseum.
 * The main game takes place there.
 * Character 1 and Character 2 will fight to the death
 *
 * @author leo
 * @version 1.0
 */
public class Game {
    private Arena arena;

    public Game(){}


    public void initialize() {
        arena = new Arena();
    }
}
