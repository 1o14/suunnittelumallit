// Abstrakti komponentti, jota kaikki osat perii
public abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public abstract int getSalary(); // palauttaa palkan

    public abstract void printXML(String indent); // tulostaa XML:n

    public void add(OrganizationComponent component) {
        // ei tee mitään oletuksena
    }

    public void remove(OrganizationComponent component) {
        // ei tee mitään oletuksena
    }
}
