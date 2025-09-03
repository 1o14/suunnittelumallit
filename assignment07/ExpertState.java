package assignment07;

// Ekspertti voi tehdä kaikki toiminnot
public class ExpertState implements State {
    public void train(GameCharacter character) {
        System.out.println("Training... +20 XP");
        character.addExperience(20);
        if (character.getExperience() >= 100) {
            System.out.println("Level up to Master!");
            character.setState(new MasterState());
        }
    }

    public void meditate(GameCharacter character) {
        System.out.println("Meditating... +15 Health");
        character.addHealth(15);
    }

    public void fight(GameCharacter character) {
        System.out.println("Fighting... +25 XP, -20 Health");
        character.addExperience(25);
        character.reduceHealth(20);
    }

    public String getLevelName() {
        return "Expert";
    }
}
