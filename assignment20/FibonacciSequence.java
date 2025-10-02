package assignment20;

import java.util.Iterator;

// FibonacciSequence: luo uuden iteratorin
// Toteuttaa myös Iterable jotta toimii for-eachissa
public class FibonacciSequence implements Sequence, Iterable<Integer> {

    private int limit;

    // konstruktori: kuinka monta lukua halutaan
    public FibonacciSequence(int limit) {
        this.limit = limit;
    }

    // palauttaa uuden iteratorin
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(limit);
    }
}
