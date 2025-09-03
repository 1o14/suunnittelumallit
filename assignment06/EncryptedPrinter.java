// Tulostaa viestin salattuna (tässä tosi simppeli salaus: käännetään merkit)
public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer wrappee) {
        super(wrappee); // otetaan sisempi tulostin
    }

    public void print(String message) {
        String encrypted = encrypt(message); // salataan viesti
        wrappee.print(encrypted); // tulostetaan salattu viesti
    }

    private String encrypt(String message) {
        // Simppeli salaus: käännetään merkkijono (ei oikea salaus, mutta riittää tähän)
        return new StringBuilder(message).reverse().toString();
    }
}
