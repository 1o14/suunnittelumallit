package assignment09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // kaksi datakokoa: pieni ja iso
        int[] sizes = {30, 100000};

        // kolme strategiaa
        SortStrategy[] strategies = {
            new BubbleSort(),
            new InsertionSort(),
            new QuickSort()
        };

        // strategioiden nimet tulostusta varten
        String[] names = {"BubbleSort", "InsertionSort", "QuickSort"};

        // käydään läpi molemmat datakoot
        for (int size : sizes) {
            System.out.println("\nData size: " + size);
            int[] original = generateRandomArray(size); // luodaan satunnainen taulukko

            // testataan jokainen strategia
            for (int i = 0; i < strategies.length; i++) {
                int[] data = original.clone(); // kopio alkuperäisestä
                SortContext context = new SortContext();
                context.setStrategy(strategies[i]);

                long start = System.nanoTime(); // aloitusaika
                context.executeStrategy(data); // suoritetaan lajittelu
                long end = System.nanoTime(); // lopetusaika

                // tulostetaan kesto millisekunteina
                System.out.println(names[i] + " took " + (end - start) / 1_000_000.0 + " ms");
            }
        }
    }

    // luodaan satunnainen taulukko
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = rand.nextInt(100000); // satunnaisia lukuja
        return array;
    }
}
