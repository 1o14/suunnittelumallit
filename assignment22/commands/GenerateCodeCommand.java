package assignment22.commands;

import assignment22.PixelGrid;

public class GenerateCodeCommand implements Command {
    private PixelGrid grid;

    public GenerateCodeCommand(PixelGrid grid) {
        this.grid = grid;
    }

    public void execute() {
        int[][] state = grid.getGridState();
        System.out.println("int[][] pixelArt = {");
        for (int i = 0; i < 8; i++) {
            System.out.print("    {");
            for (int j = 0; j < 8; j++) {
                System.out.print(state[i][j]);
                if (j < 7) System.out.print(", ");
            }
            System.out.println(i < 7 ? "}," : "}");
        }
        System.out.println("};");
    }
}
