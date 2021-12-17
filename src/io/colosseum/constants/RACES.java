package io.colosseum.constants;

import io.colosseum.objects.Race;

/**
 * Holds all the races
 *
 * @author leo
 * @version 1.0
 */
public final class RACES {
    // 5 HP = 1S / 1D
    // basic values : health 20, strength 3, defense 3
    public static final Race HUMAN = new Race("Human", 20, 3, 3);
    public static final Race ELF = new Race("Elf", 15, 4, 3);

    // Array with all the available races
    public static final Race[] RACES = {HUMAN, ELF};
}
