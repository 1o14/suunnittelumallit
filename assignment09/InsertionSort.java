package assignment09;

// Lähde: GeeksforGeeks Insertion Sort
public class InsertionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // lisätään yksi luku kerrallaan oikealle paikalle
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            // siirretään suurempia lukuja oikealle
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key; // asetetaan luku paikalleen
        }
    }
}
