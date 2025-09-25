package assignment14;

// Rakentaa pelitietokoneen
public class GamingComputerBuilder implements ComputerBuilder {
    Computer computer = new Computer();

    public void buildProcessor() {
        computer.processor = "Intel Core i9";
    }

    public void buildRAM() {
        computer.ram = 32;
    }

    public void buildHardDrive() {
        computer.hardDrive = "1 TB SSD";
    }

    public void buildGraphicsCard() {
        computer.graphicsCard = "NVIDIA RTX 4090";
    }

    public void buildOperatingSystem() {
        computer.operatingSystem = "Windows 11";
    }

    public Computer getComputer() {
        return computer;
    }
}
