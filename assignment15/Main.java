package assignment15;

// Tämä on pääohjelma, joka testaa adapterin toiminnan
public class Main {
    public static void main(String[] args) {

        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(25);
        date.setMonth(9); 
        date.setYear(2025);

        System.out.println("Original date:");
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());

        date.advanceDays(10);

        System.out.println("After advancing 10 days:");
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());
    }
}
