package assignment09;

// Lähde: GeeksforGeeks Quick Sort
public class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // kutsutaan rekursiivista quicksortia
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        // jaetaan taulukko pienempiin osiin
        if (low < high) {
            int pi = partition(arr, low, high); // saadaan jakoindeksi
            quickSort(arr, low, pi - 1); // lajitellaan vasen osa
            quickSort(arr, pi + 1, high); // lajitellaan oikea osa
        }
    }

    private int partition(int[] arr, int low, int high) {
        // valitaan viimeinen alkio pivotiksi
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // siirretään pienemmät luvut vasemmalle
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        // asetetaan pivot oikealle paikalle
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}
