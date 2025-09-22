package assignment12;

// Dokumentin rajapinta
public interface Document {
    String getCreationDate(); // Palauttaa luontipäivän
    String getContent(User user) throws AccessDeniedException; // Palauttaa sisällön, käyttäjän mukaan
}
