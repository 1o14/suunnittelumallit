package assignment19;

// UI: JavaFX-ikkuna yhdelle clientille
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClient {
    private String username;
    private ChatClientController controller;

    private TextArea chatArea = new TextArea();
    private TextField messageField = new TextField();
    private ComboBox<String> recipientBox = new ComboBox<>();
    private Button sendButton = new Button("Send");

    public ChatClient(String username, ChatClientController controller) {
        this.username = username;
        this.controller = controller;
    }

    // käynnistä ikkuna
    public void launchWindow() {
        Platform.runLater(() -> {
            Stage stage = new Stage();
            stage.setTitle("Chat - " + username);

            chatArea.setEditable(false);
            recipientBox.getItems().addAll(controller.getAllUsernames());
            recipientBox.getItems().remove(username); // ei voi lähettää itselle

            sendButton.setOnAction(e -> {
                String to = recipientBox.getValue();
                String msg = messageField.getText();
                if (to != null && !msg.isEmpty()) {
                    controller.sendMessage(to, msg);
                    messageField.clear();
                }
            });

            VBox layout = new VBox(10, chatArea, recipientBox, messageField, sendButton);
            stage.setScene(new Scene(layout, 400, 300));
            stage.show();
        });
    }

    // lisää viesti chattiin
    public void appendMessage(String msg) {
        Platform.runLater(() -> chatArea.appendText(msg + "\n"));
    }
}
