package assignment17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Luo satunnaisen kartan tileistä
public class MapGenerator {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;

    public static List<Tile> generateMap() {
        List<Tile> tiles = new ArrayList<>();
        Random rand = new Random();

        // Luodaan tile-tyypit (jaettava tila)
        TileType grass = new TileType("Grass", "file:assignment17/assets/grass.png");
        TileType water = new TileType("Water", "file:assignment17/assets/water.png");
        TileType mountain = new TileType("Mountain", "file:assignment17/assets/mountain.png");

        TileType[] types = {grass, water, mountain};

        // Luodaan tilet satunnaisesti
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                TileType type = types[rand.nextInt(types.length)];
                tiles.add(new Tile(x, y, type));
            }
        }

        return tiles;
    }
}
