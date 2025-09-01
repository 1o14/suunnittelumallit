// Tyyli B:n tehdas – luo B-tyylin elementtejä
public class BFactory extends UIFactory {
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }

    public Checkbox createCheckbox(String text) {
        return new CheckboxB(text);
    }
}
