package assignment12;

// Testataan systeemiä
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Käyttäjät
        User alice = new User("alice");
        User bob = new User("bob");

        // Dokumentit
        library.addUnprotectedDocument("doc1", "2023-01-01", "Public content");
        library.addProtectedDocument("doc2", "2023-02-01", "Secret content", "alice");

        // Testit
        try {
            System.out.println("doc1 by bob: " + library.getDocument("doc1").getContent(bob));
            System.out.println("doc2 by alice: " + library.getDocument("doc2").getContent(alice));
            System.out.println("doc2 by bob: " + library.getDocument("doc2").getContent(bob)); // Ei pääsyä
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
