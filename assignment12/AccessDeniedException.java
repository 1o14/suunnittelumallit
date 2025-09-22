package assignment12;

// Poikkeus jos ei pääsyä
public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}
