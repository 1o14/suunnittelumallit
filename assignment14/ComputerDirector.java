package assignment14;

// Tämä luokka ohjaa rakentamista
public class ComputerDirector {
    private ComputerBuilder builder;

    // Asetetaan käytettävä builder
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    // Rakennetaan tietokone kutsumalla builderin metodeja
    public void constructComputer() {
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildGraphicsCard();
        builder.buildOperatingSystem();
    }

    // Palautetaan valmis tietokone
    public Computer getComputer() {
        return builder.getComputer();
    }
}
