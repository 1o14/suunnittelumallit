package assignment19;

// Controller: hoitaa yhden clientin logiikan
public class ChatClientController {
    private String username;
    private ChatClient ui;
    private ChatMediator mediator;

    public ChatClientController(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        this.ui = new ChatClient(username, this);
        mediator.registerClient(username, this);
    }

    // kun käyttäjä lähettää viestin
    public void sendMessage(String to, String message) {
        mediator.sendMessage(username, to, message);
        ui.appendMessage("You to " + to + ": " + message);
    }

    // kun käyttäjä saa viestin
    public void receiveMessage(String from, String message) {
        ui.appendMessage(from + " to you: " + message);
    }

    // käynnistä UI
    public void showUI() {
        ui.launchWindow();
    }

    // hae kaikki käyttäjänimet
    public String[] getAllUsernames() {
        return mediator.getUsernames();
    }
}
