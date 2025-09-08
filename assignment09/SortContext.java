package assignment09;

// Strategian valitsija
public class SortContext {
    private SortStrategy strategy;

    // asetetaan käytettävä lajittelualgoritmi
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    // suoritetaan lajittelu valitulla strategialla
    public void executeStrategy(int[] array) {
        strategy.sort(array);
    }
}
