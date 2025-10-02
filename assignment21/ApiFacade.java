package assignment21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Facade: yksinkertaistaa API-kutsut ja JSON-parsinta
public class ApiFacade {

    // hakee attribuutin arvon annetusta URL:stä
    public String getAttributeValueFromJson(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {
        try {
            String json = fetchJson(urlString);
            return parseAttribute(json, attributeName);
        } catch (IOException e) {
            throw new IOException("HTTP request failed: " + e.getMessage());
        } catch (ParseException e) {
            throw new IOException("JSON parsing failed: " + e.getMessage());
        }
    }

    // tekee HTTP GET -pyynnön
    private String fetchJson(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    // parsii JSON ja hakee attribuutin arvon
    private String parseAttribute(String json, String attributeName) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(json);

        Object value = obj.get(attributeName);
        if (value == null) {
            throw new IllegalArgumentException("Attribute '" + attributeName + "' not found in JSON.");
        }
        return value.toString();
    }
}
