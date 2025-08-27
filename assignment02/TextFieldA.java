// Tyyli A:n tekstikenttä – hakasulut
public class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    public void display() {
        System.out.println("[ " + text + " ]");
    }
}
