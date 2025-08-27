// Tyyli B:n tekstikenttä – kulmasulut
public class TextFieldB extends TextField {
    public TextFieldB(String text) {
        super(text);
    }

    public void display() {
        System.out.println("<< " + text + " >>");
    }
}
