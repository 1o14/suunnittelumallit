package assignment11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Tallennettu tila + aikaleima
public class Memento {
    private final Model state;
    private final String timestamp;

    public Memento(Model state) {
        this.state = state.copy();
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public Model getState() {
        return state.copy();
    }

    public String getDescription() {
        return timestamp + " - " + state.getSummary();
    }
}
