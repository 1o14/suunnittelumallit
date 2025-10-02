package assignment22.commands;

import assignment22.PixelGrid;

public class MoveCursorDownCommand implements Command {
    private PixelGrid grid;

    public MoveCursorDownCommand(PixelGrid grid) {
        this.grid = grid;
    }

    public void execute() {
        grid.moveCursor(1, 0);
    }
}
