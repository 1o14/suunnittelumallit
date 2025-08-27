public class Employee extends OrganizationComponent {
    private int salary;

    // Konstruktori, jossa asetetaan nimi ja palkka
    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    // Palauttaa työntekijän palkan
    @Override
    public int getSalary() {
        return salary;
    }

    // Tulostaa työntekijän tiedot XML-muodossa
    @Override
    public void printXML(String indent) {
        System.out.println(indent + "<employee name=\"" + name + "\" salary=\"" + salary + "\" />");
    }
}
