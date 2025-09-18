package assignment11;

// Malli: värit ja checkbox
public class Model {
    private String color1;
    private String color2;
    private String color3;
    private boolean checkbox;

    public Model(String c1, String c2, String c3, boolean cb) {
        this.color1 = c1;
        this.color2 = c2;
        this.color3 = c3;
        this.checkbox = cb;
    }

    public String getColor1() { return color1; }
    public void setColor1(String c) { color1 = c; }

    public String getColor2() { return color2; }
    public void setColor2(String c) { color2 = c; }

    public String getColor3() { return color3; }
    public void setColor3(String c) { color3 = c; }

    public boolean isCheckbox() { return checkbox; }
    public void setCheckbox(boolean cb) { checkbox = cb; }

    public Model copy() {
        return new Model(color1, color2, color3, checkbox);
    }

    public String getSummary() {
        return "Colors: " + color1 + ", " + color2 + ", " + color3 + " | Checkbox: " + checkbox;
    }
}
