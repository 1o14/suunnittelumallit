package assignment22;

import assignment22.commands.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PixelArtEditor extends Application {

    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        PixelGrid grid = new PixelGrid(gridPane);

        Command up = new MoveCursorUpCommand(grid);
        Command down = new MoveCursorDownCommand(grid);
        Command left = new MoveCursorLeftCommand(grid);
        Command right = new MoveCursorRightCommand(grid);
        Command toggle = new TogglePixelCommand(grid);
        Command generate = new GenerateCodeCommand(grid);

        Button generateButton = new Button("Create Code");
        generateButton.setOnAction(e -> generate.execute());

        BorderPane root = new BorderPane();
        root.setCenter(gridPane);
        root.setBottom(generateButton);

        Scene scene = new Scene(root, 300, 320);

        root.setFocusTraversable(true);
        root.requestFocus();

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) up.execute();
            else if (e.getCode() == KeyCode.DOWN) down.execute();
            else if (e.getCode() == KeyCode.LEFT) left.execute();
            else if (e.getCode() == KeyCode.RIGHT) right.execute();
            else if (e.getCode() == KeyCode.SPACE) toggle.execute();
        });

        stage.setTitle("Pixel Art Editor");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
