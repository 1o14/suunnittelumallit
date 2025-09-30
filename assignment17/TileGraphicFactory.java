package assignment17;

import javafx.scene.image.Image;
import java.util.HashMap;

// Flyweight-tehdas joka jakaa kuvat tile-tyypin mukaan
public class TileGraphicFactory {
    private static HashMap<String, Image> imageCache = new HashMap<>();

    public static Image getTileImage(TileType type) {
        String path = type.getImagePath();

        // Jos kuva on jo ladattu, käytetään sitä uudelleen
        if (!imageCache.containsKey(path)) {
            imageCache.put(path, new Image(path));
        }

        return imageCache.get(path);
    }
}
