package assignment11;

// Vastaa nykyisestä tilasta
public class Originator {
    private Model model;

    public Originator(Model model) {
        this.model = model;
    }

    public Memento saveToMemento() {
        return new Memento(model);
    }

    public void restoreFromMemento(Memento m) {
        this.model = m.getState();
    }

    public Model getModel() {
        return model;
    }
}
