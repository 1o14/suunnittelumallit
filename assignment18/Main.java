package assignment18;

import java.util.Scanner;

// Main-luokka: komentorivikäyttöliittymä
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // alkuperäinen suositus
        Recommendation fantasyTeens = new Recommendation("Fantasy lovers (teens)");
        fantasyTeens.addBook(new Book("J.K. Rowling", "Harry Potter", "Fantasy", 1997));
        fantasyTeens.addBook(new Book("Rick Riordan", "Percy Jackson", "Fantasy", 2005));

        System.out.println("Original Recommendation:");
        System.out.println(fantasyTeens);

        // kloonataan ja muokataan
        Recommendation cloned = fantasyTeens.clone();
        cloned.setTargetAudience("Fantasy lovers (adults)");
        cloned.addBook(new Book("J.R.R. Tolkien", "The Lord of the Rings", "Fantasy", 1954));

        System.out.println("Cloned and Modified Recommendation:");
        System.out.println(cloned);

        // käyttäjän oma lista
        System.out.println("Create your own recommendation:");
        System.out.print("Enter target audience: ");
        String audience = scanner.nextLine();
        Recommendation userList = new Recommendation(audience);

        while (true) {
            System.out.print("Add a book? (yes/no): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) break;

            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Genre: ");
            String genre = scanner.nextLine();
            System.out.print("Year: ");
            int year = Integer.parseInt(scanner.nextLine());

            userList.addBook(new Book(author, title, genre, year));
        }

        System.out.println("Your Recommendation:");
        System.out.println(userList);
    }
}
