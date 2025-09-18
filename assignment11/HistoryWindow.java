package assignment11;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;
import java.util.function.Consumer;

// Näyttää historian listana
public class HistoryWindow {
    public static void show(List<Memento> history, Consumer<Memento> onSelect) {
        Stage stage = new Stage();
        ListView<Memento> listView = new ListView<>();
        listView.getItems().addAll(history);

        listView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(Memento item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty || item == null ? null : item.getDescription());
            }
        });

        listView.setOnMouseClicked(e -> {
            Memento selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                onSelect.accept(selected);
                stage.close();
            }
        });

        VBox root = new VBox(listView);
        stage.setScene(new Scene(root, 400, 300));
        stage.setTitle("History");
        stage.show();
    }
}
