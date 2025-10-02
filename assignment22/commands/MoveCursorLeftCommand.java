package assignment22.commands;

import assignment22.PixelGrid;

public class MoveCursorLeftCommand implements Command {
    private PixelGrid grid;

    public MoveCursorLeftCommand(PixelGrid grid) {
        this.grid = grid;
    }

    public void execute() {
        grid.moveCursor(0, -1);
    }
}
