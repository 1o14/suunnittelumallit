package assignment22;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PixelGrid {
    private Rectangle[][] pixels = new Rectangle[8][8];
    private int[][] state = new int[8][8];
    private int cursorRow = 0;
    private int cursorCol = 0;

    public PixelGrid(GridPane gridPane) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle r = new Rectangle(30, 30, Color.WHITE);
                r.setStroke(Color.GRAY);
                pixels[i][j] = r;
                gridPane.add(r, j, i);
            }
        }
        updateCursor();
    }

    public void moveCursor(int dRow, int dCol) {
        int newRow = cursorRow + dRow;
        int newCol = cursorCol + dCol;
        if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8) {
            cursorRow = newRow;
            cursorCol = newCol;
            updateCursor();
        }
    }

    public void togglePixel() {
        state[cursorRow][cursorCol] = 1 - state[cursorRow][cursorCol];
        updateCursor();
    }

    public int[][] getGridState() {
        return state;
    }

    private void updateCursor() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (state[i][j] == 1) {
                    pixels[i][j].setFill(Color.BLACK);
                } else {
                    pixels[i][j].setFill(Color.WHITE);
                }
                if (i == cursorRow && j == cursorCol) {
                    pixels[i][j].setStroke(Color.RED);
                } else {
                    pixels[i][j].setStroke(Color.GRAY);
                }
            }
        }
    }
}
