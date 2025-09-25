package assignment14;

// Tämä on rajapinta, joka määrittelee metodit komponenttien rakentamiseen
public interface ComputerBuilder {
    void buildProcessor();
    void buildRAM();
    void buildHardDrive();
    void buildGraphicsCard();
    void buildOperatingSystem();
    Computer getComputer(); // palauttaa valmiin tietokoneen
}
