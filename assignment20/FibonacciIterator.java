package assignment20;

import java.util.Iterator;

// FibonacciIterator: hoitaa itse laskennan
public class FibonacciIterator implements Iterator<Integer> {

    private int count = 0;
    private int limit;
    private int prev = 0;
    private int curr = 1;

    public FibonacciIterator(int limit) {
        this.limit = limit;
    }

    // onko vielä lukuja jäljellä
    @Override
    public boolean hasNext() {
        return count < limit;
    }

    // laskee seuraavan luvun
    @Override
    public Integer next() {
        count++;
        int nextValue = curr;
        int temp = curr;
        curr = curr + prev;
        prev = temp;
        return nextValue;
    }
}
