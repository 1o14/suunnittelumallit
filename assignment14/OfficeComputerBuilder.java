package assignment14;

// Rakentaa toimistotietokoneen
public class OfficeComputerBuilder implements ComputerBuilder {
    Computer computer = new Computer();

    public void buildProcessor() {
        computer.processor = "Intel Core i5";
    }

    public void buildRAM() {
        computer.ram = 16;
    }

    public void buildHardDrive() {
        computer.hardDrive = "512 GB SSD";
    }

    public void buildGraphicsCard() {
        computer.graphicsCard = "Integrated Graphics";
    }

    public void buildOperatingSystem() {
        computer.operatingSystem = "Windows 10";
    }

    public Computer getComputer() {
        return computer;
    }
}
