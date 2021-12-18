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
public class Arena {
    private Character character1;
    private Character character2;

    /**
     * Constructor for an arena with given Characters
     *
     * @param character1 The first fighter
     * @param character2 The second fighter
     */
    public Arena(Character character1, Character character2) {
        this.character1 = character1;
        this.character2 = character2;
    }

    /**
     * Constructor for an arena with no given Characters.
     * Two new Characters are initialized
     */
    public Arena() {
        new Arena(new Character(), new Character());

    }
}
