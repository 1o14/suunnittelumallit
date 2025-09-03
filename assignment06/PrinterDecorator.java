// Dekoraattorin pohjaluokka, ottaa toisen Printerin sisään
public abstract class PrinterDecorator implements Printer {
    protected Printer wrappee; // tämä on se "sisempi" tulostin

    public PrinterDecorator(Printer wrappee) {
        this.wrappee = wrappee; // asetetaan sisempi tulostin
    }
}
