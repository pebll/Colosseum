package Objects;

import CONSTANTS.GAME;

import java.util.Random;

public class Person {
    private Race race;
    // main stats
    private int maxHealth;
    private int strength;  // damage = rawDamage + strength
    private int defense;  // damage = enemyDamage - defense

    public Person(Race race) {
        this.race = race;
        this.maxHealth = race.getHealth();
        this.strength = race.getStrength();
        this.defense = race.getDefense();
        randomiseStats();
    }

    private void randomiseStats(){
        int[] stats = {maxHealth, strength, defense};
        for(int i = 0; i < GAME.PERSON_RANDOM_FACTOR *2; i++){
            int random = new Random().nextInt(3);

        }
    }
}
