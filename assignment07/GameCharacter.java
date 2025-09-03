package assignment07;

// Pelihahmo, jolla on nimi, kokemus, terveys ja nykyinen taso
public class GameCharacter {
    private String name;
    private int experience = 0;
    private int health = 100;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.state = new NoviceState(); // aloitetaan noviisina
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int getExperience() {
        return experience;
    }

    public void addExperience(int amount) {
        experience += amount;
    }

    public int getHealth() {
        return health;
    }

    public void addHealth(int amount) {
        health += amount;
    }

    public void reduceHealth(int amount) {
        health -= amount;
    }

    public String getName() {
        return name;
    }

    public void showStatus() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + state.getLevelName());
        System.out.println("XP: " + experience);
        System.out.println("Health: " + health);
        System.out.println("Available actions: " + getActions());
    }

    private String getActions() {
        if (state instanceof NoviceState) return "train";
        if (state instanceof IntermediateState) return "train, meditate";
        if (state instanceof ExpertState) return "train, meditate, fight";
        return "none";
    }
}
