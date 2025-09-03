package assignment07;

// Noviisi voi vain treenata
public class NoviceState implements State {
    public void train(GameCharacter character) {
        System.out.println("Training... +10 XP");
        character.addExperience(10);
        if (character.getExperience() >= 30) {
            System.out.println("Level up to Intermediate!");
            character.setState(new IntermediateState());
        }
    }

    public void meditate(GameCharacter character) {
        System.out.println("Can't meditate yet.");
    }

    public void fight(GameCharacter character) {
        System.out.println("Can't fight yet.");
    }

    public String getLevelName() {
        return "Novice";
    }
}
