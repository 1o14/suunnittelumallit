package assignment07;

// Mestari ei tee enää mitään – peli päättyy
public class MasterState implements State {
    public void train(GameCharacter character) {
        System.out.println("You're already a master.");
    }

    public void meditate(GameCharacter character) {
        System.out.println("You're already a master.");
    }

    public void fight(GameCharacter character) {
        System.out.println("You're already a master.");
    }

    public String getLevelName() {
        return "Master";
    }
}
