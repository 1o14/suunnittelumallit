package assignment07;

import java.util.Scanner;

// Pääohjelma – pelaaja valitsee toimintoja kunnes hahmo on mestari
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Bianka");

        while (!(character.getState() instanceof MasterState)) {
            character.showStatus();
            System.out.print("Choose action: ");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "train":
                    character.train();
                    break;
                case "meditate":
                    character.meditate();
                    break;
                case "fight":
                    character.fight();
                    break;
                default:
                    System.out.println("Unknown command.");
            }
            System.out.println();
        }

        System.out.println("Congratulations! You're now a master.");
    }
}
