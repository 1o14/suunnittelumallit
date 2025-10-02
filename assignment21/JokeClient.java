package assignment21;

// Client joka käyttää facadea Chuck Norris -vitsin hakemiseen
public class JokeClient {
    private ApiFacade facade = new ApiFacade();

    public String getRandomJoke() throws Exception {
        String url = "https://api.chucknorris.io/jokes/random";
        return facade.getAttributeValueFromJson(url, "value");
    }
}
