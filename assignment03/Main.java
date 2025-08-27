// Main-luokka, jossa testataan toiminnallisuus
public class Main {
    public static void main(String[] args) {
        // Luodaan pääorganisaatio
        Department root = new Department("Company");

        // Luodaan osastoja
        Department it = new Department("IT");
        Department hr = new Department("HR");

        // Luodaan työntekijöitä
        Employee mikko = new Employee("Mikko", 4000);
        Employee anna = new Employee("Anna", 3500);
        Employee jussi = new Employee("Jussi", 3000);

        // Lisätään työntekijät osastoihin
        it.add(mikko);
        it.add(anna);
        hr.add(jussi);

        // Lisätään osastot pääorganisaatioon
        root.add(it);
        root.add(hr);

        // Tulostetaan koko organisaatio XML-muodossa
        System.out.println("Organization structure in XML:");
        root.printXML("");

        // Tulostetaan kokonaispalkka
        System.out.println("\nTotal salary: " + root.getSalary() + " €");
    }
}
