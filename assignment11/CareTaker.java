package assignment11;

import java.util.ArrayList;
import java.util.List;

// Tallentaa undo/redo-historian
public class CareTaker {
    private final List<Memento> history = new ArrayList<>();
    private final List<Memento> redoList = new ArrayList<>();

    public void save(Memento m) {
        history.add(m);
        redoList.clear(); // uusi muutos → tyhjennä redo
    }

    public Memento undo(Memento current) {
        if (history.size() < 2) return null;
        redoList.add(current);
        history.remove(history.size() - 1);
        return history.get(history.size() - 1);
    }

    public Memento redo(Memento current) {
        if (redoList.isEmpty()) return null;
        history.add(current);
        return redoList.remove(redoList.size() - 1);
    }

    public List<Memento> getHistory() {
        return new ArrayList<>(history);
    }
}
