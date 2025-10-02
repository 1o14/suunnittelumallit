package assignment22.commands;

import assignment22.PixelGrid;

public class MoveCursorUpCommand implements Command {
    private PixelGrid grid;

    public MoveCursorUpCommand(PixelGrid grid) {
        this.grid = grid;
    }

    public void execute() {
        grid.moveCursor(-1, 0);
    }
}
