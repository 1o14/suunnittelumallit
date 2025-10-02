package assignment21;

// Main: testaa facadea kahdella API:lla
public class Main {
    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();

        // Chuck Norris -vitsi
        try {
            JokeClient jokeClient = new JokeClient();
            String joke = jokeClient.getRandomJoke();
            System.out.println("Chuck Norris joke:");
            System.out.println(joke);
        } catch (Exception e) {
            System.out.println("Joke fetch failed: " + e.getMessage());
        }

        // Valuuttakurssi (esimerkki: EUR)
        try {
            String url = "https://api.exchangerate.host/latest?base=USD";
            String eurRate = facade.getAttributeValueFromJson(url, "rates");
            System.out.println("\nExchange rates (USD base):");
            System.out.println("EUR rate object: " + eurRate); // koko rates-objekti
        } catch (Exception e) {
            System.out.println("Exchange rate fetch failed: " + e.getMessage());
        }
    }
}
