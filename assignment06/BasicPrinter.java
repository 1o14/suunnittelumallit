// Perus tulostin, tulostaa viestin suoraan
public class BasicPrinter implements Printer {
    public void print(String message) {
        System.out.println(message); // tulostetaan viesti konsoliin
    }
}