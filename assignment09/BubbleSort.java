package assignment09;

// Lähde: GeeksforGeeks Bubble Sort
public class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // käydään taulukkoa läpi ja vaihdetaan vierekkäisiä jos väärässä järjestyksessä
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // vaihdetaan luvut
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
