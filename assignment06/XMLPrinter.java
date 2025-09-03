// Tulostaa viestin XML-muodossa
public class XMLPrinter extends PrinterDecorator {
    public XMLPrinter(Printer wrappee) {
        super(wrappee); // kutsutaan yläluokan konstruktoria
    }

    public void print(String message) {
        String xmlMessage = "<message>" + message + "</message>"; // lisätään XML-tagit
        wrappee.print(xmlMessage); // tulostetaan muokattu viesti
    }
}