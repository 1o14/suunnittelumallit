package assignment20;

// Main: testaa FibonacciSequencea
public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibSeq = new FibonacciSequence(10); // halutaan 10 lukua

        System.out.println("First 10 Fibonacci numbers:");
        for (int num : fibSeq) {
            System.out.print(num + " ");
        }
    }
}
