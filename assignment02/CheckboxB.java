// Tyyli B:n checkbox – neliösulut
public class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    public void display() {
        System.out.println("[ ] " + text);
    }
}
