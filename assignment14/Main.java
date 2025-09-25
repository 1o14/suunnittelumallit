package assignment14;

// Pääohjelma, jossa rakennetaan eri tietokoneita
public class Main {
    public static void main(String[] args) {
        // Rakennetaan pelitietokone
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingBuilder);
        director1.constructComputer();
        Computer gamingPC = director1.getComputer();
        System.out.println("Gaming PC Specs:");
        gamingPC.showSpecs();

        System.out.println("\n------------------\n");

        // Rakennetaan toimistotietokone
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);
        director2.constructComputer();
        Computer officePC = director2.getComputer();
        System.out.println("Office PC Specs:");
        officePC.showSpecs();
    }
}
