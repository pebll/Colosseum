package io.colosseum.objects;

import io.colosseum.constants.GAME;
import io.colosseum.constants.RACES;

import java.util.Random;

/**
 * Describes a Character.
 * Can hold weapons and dies when health reaches 0.
 *
 * @author leo
 * @version 1.0
 */
public class Character {
    private Race race;
    // main stats
    private int maxHealth;
    private int strength;  // damage = rawDamage + strength
    private int defense;  // damage = enemyDamage - defense


    /**
     * Constructor for a new character with a given race
     *
     * @param race The race the character should be
     */
    public Character(Race race) {
        this.race = race;
        this.maxHealth = race.getHealth();
        this.strength = race.getStrength();
        this.defense = race.getDefense();
        randomiseStats();
    }

    /**
     * Constructor for a new character with a random race
     */
    public Character() {
        Race race = RACES.RACES[new Random().nextInt(RACES.RACES.length)];
        new Character(race);
    }

    /**
     * Randomises the stats of a Character.
     * Varies the values a bit GAME.PERSON_RANDOM_FACTOR times
     */
    private void randomiseStats() {
        // TODO: replace with traits
        int[] stats = new int[]{maxHealth, strength, defense};
        for (int i = 0; i < GAME.PERSON_RANDOM_FACTOR * 2; i++) {
            int random = new Random().nextInt(3);

            int amount = 1; // amount to change the value
            if (random == 0) amount = 5; // health varies 5
            if (i % 2 == 0) amount *= -1; // to have consistent and balanced randomising

            stats[random] += amount;
        }
        maxHealth = stats[0];
        strength = stats[1];
        defense = stats[2];
    }
}
