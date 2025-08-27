// Testiluokka – täällä luodaan ja näytetään elementit
public class Main {
    public static void main(String[] args) {
        // Valitse tyyli: AFactory tai BFactory
        UIFactory factory = new AFactory(); //Tän voi vaihtaa myös "BFactory();" jos haluaa nähdä toisen tyylin

        // Luodaan elementit
        Button button = factory.createButton("OK");
        TextField textField = factory.createTextField("Enter name");
        Checkbox checkbox = factory.createCheckbox("Accept terms");

        // Näytetään alkuperäiset
        button.display();
        textField.display();
        checkbox.display();

        System.out.println("\n-- Päivitetään tekstit --\n");

        // Muutetaan tekstit
        button.setText("Cancel");
        textField.setText("Enter email");
        checkbox.setText("Subscribe");

        // Näytetään päivitetyt
        button.display();
        textField.display();
        checkbox.display();
    }
}
