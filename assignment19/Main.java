package assignment19;

// Main: luo mediator ja clientit
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChatMediator mediator = new ChatMediator();

        ChatClientController alice = new ChatClientController("Alice", mediator);
        ChatClientController bob = new ChatClientController("Bob", mediator);
        ChatClientController clara = new ChatClientController("Clara", mediator);

        alice.showUI();
        bob.showUI();
        clara.showUI();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
