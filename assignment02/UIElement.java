// Yliluokka kaikille käyttöliittymäelementeille
public abstract class UIElement {
    protected String text;

    public UIElement(String text) {
        this.text = text;
    }

    // Vaihtaa elementin tekstiä
    public void setText(String text) {
        this.text = text;
    }

    // Näyttää elementin – toteuttaa aliluokissa
    public abstract void display();
}
