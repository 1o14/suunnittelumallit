package assignment17;

// TileType kuvaa jaetun tilan (intrinsic state) - esim. nimi ja kuva
public class TileType {
    private String name;
    private String imagePath;

    public TileType(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }
}
