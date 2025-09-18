package assignment11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Käyttöliittymä + undo/redo + historia
public class MainApp extends Application {
    private Originator originator;
    private CareTaker caretaker;

    @Override
    public void start(Stage primaryStage) {
        Model model = new Model("red", "green", "blue", false);
        originator = new Originator(model);
        caretaker = new CareTaker();
        caretaker.save(originator.saveToMemento());

        TextField color1 = new TextField(model.getColor1());
        TextField color2 = new TextField(model.getColor2());
        TextField color3 = new TextField(model.getColor3());
        CheckBox check = new CheckBox("Check me");
        check.setSelected(model.isCheckbox());

        Button saveBtn = new Button("Save");
        Button historyBtn = new Button("Show History");

        saveBtn.setOnAction(e -> {
            model.setColor1(color1.getText());
            model.setColor2(color2.getText());
            model.setColor3(color3.getText());
            model.setCheckbox(check.isSelected());
            caretaker.save(originator.saveToMemento());
        });

        historyBtn.setOnAction(e -> {
            HistoryWindow.show(caretaker.getHistory(), m -> {
                originator.restoreFromMemento(m);
                updateUI(color1, color2, color3, check);
            });
        });

        VBox root = new VBox(color1, color2, color3, check, saveBtn, historyBtn);
        Scene scene = new Scene(root, 400, 300);

        scene.setOnKeyPressed(event -> {
            if (event.isControlDown()) {
                if (event.getCode() == KeyCode.Z) {
                    Memento prev = caretaker.undo(originator.saveToMemento());
                    if (prev != null) {
                        originator.restoreFromMemento(prev);
                        updateUI(color1, color2, color3, check);
                    }
                } else if (event.getCode() == KeyCode.Y) {
                    Memento next = caretaker.redo(originator.saveToMemento());
                    if (next != null) {
                        originator.restoreFromMemento(next);
                        updateUI(color1, color2, color3, check);
                    }
                }
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Memento App");
        primaryStage.show();
    }

    private void updateUI(TextField c1, TextField c2, TextField c3, CheckBox cb) {
        Model m = originator.getModel();
        c1.setText(m.getColor1());
        c2.setText(m.getColor2());
        c3.setText(m.getColor3());
        cb.setSelected(m.isCheckbox());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
