import java.util.Random;

public class WildernessMap extends Map {
    private Random rand = new Random(); 

    public Tile createTile() {
        int r = rand.nextInt(3); // 0 = swamp, 1 = water, 2 = forest
        switch (r) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            case 2: return new ForestTile();
            default: return new ForestTile();
        }
    }
}
