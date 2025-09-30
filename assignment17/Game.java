package assignment17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.List;

// JavaFX-pääluokka joka näyttää kartan
public class Game extends Application {
    @Override
    public void start(Stage stage) {
        List<Tile> map = MapGenerator.generateMap();

        Canvas canvas = new Canvas(320, 320); // 10x10 tileä, jokainen 32px
        GraphicsContext gc = canvas.getGraphicsContext2D();

        MapRenderer.render(gc, map);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        stage.setTitle("RPG Map with Flyweight");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
