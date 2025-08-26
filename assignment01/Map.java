public abstract class Map {
    protected Tile[][] tiles;
    protected int width = 5;
    protected int height = 5;

    public Map() {
        tiles = new Tile[height][width];
        
    }

    public void generateTiles() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile(); 
            }
        }
    }

    public abstract Tile createTile();

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
