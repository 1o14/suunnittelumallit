package assignment22.commands;

import assignment22.PixelGrid;

public class TogglePixelCommand implements Command {
    private PixelGrid grid;

    public TogglePixelCommand(PixelGrid grid) {
        this.grid = grid;
    }

    public void execute() {
        grid.togglePixel();
    }
}
