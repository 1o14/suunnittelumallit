package assignment07;

// Välitasolla voi treenata ja meditoida
public class IntermediateState implements State {
    public void train(GameCharacter character) {
        System.out.println("Training... +15 XP");
        character.addExperience(15);
        if (character.getExperience() >= 60) {
            System.out.println("Level up to Expert!");
            character.setState(new ExpertState());
        }
    }

    public void meditate(GameCharacter character) {
        System.out.println("Meditating... +10 Health");
        character.addHealth(10);
    }

    public void fight(GameCharacter character) {
        System.out.println("Can't fight yet.");
    }

    public String getLevelName() {
        return "Intermediate";
    }
}
