package assignment17;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import java.util.List;

// Piirtää kartan JavaFX canvasille
public class MapRenderer {
    private static final int TILE_SIZE = 32;

    public static void render(GraphicsContext gc, List<Tile> tiles) {
        for (Tile tile : tiles) {
            Image img = TileGraphicFactory.getTileImage(tile.getType());
            gc.drawImage(img, tile.getX() * TILE_SIZE, tile.getY() * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }
    }
}
