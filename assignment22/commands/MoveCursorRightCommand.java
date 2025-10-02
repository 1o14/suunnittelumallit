package assignment22.commands;

import assignment22.PixelGrid;

public class MoveCursorRightCommand implements Command {
    private PixelGrid grid;

    public MoveCursorRightCommand(PixelGrid grid) {
        this.grid = grid;
    }

    public void execute() {
        grid.moveCursor(0, 1);
    }
}
