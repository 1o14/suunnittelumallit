// Tyyli A:n checkbox – pyöreät sulut
public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    public void display() {
        System.out.println("( ) " + text);
    }
}
