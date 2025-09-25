package assignment14;

// Tämä luokka edustaa lopullista tietokonetta
public class Computer {
    String processor;
    int ram;
    String hardDrive;
    String graphicsCard;
    String operatingSystem;

    // Tulostetaan tietokoneen kokoonpano
    public void showSpecs() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Hard Drive: " + hardDrive);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + operatingSystem);
    }
}
