package Objects;

public class Race {
    private String name;
    private int baseHealth;
    private int baseStrength;
    private int baseDefense;

    public Race(String name, int baseHealth, int baseStrength, int baseDefense) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseStrength = baseStrength;
        this.baseDefense = baseDefense;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return baseHealth;
    }

    public int getStrength() {
        return baseStrength;
    }

    public int getDefense() {
        return baseDefense;
    }
}
