package assignment07;

// Rajapinta hahmon eri tasoille
public interface State {
    void train(GameCharacter character);     // treenaa
    void meditate(GameCharacter character);  // meditoi
    void fight(GameCharacter character);     // taistele
    String getLevelName();                   // tason nimi
}
