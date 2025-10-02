package assignment19;

// Mediator: hoitaa viestien välityksen
import java.util.HashMap;

public class ChatMediator {
    private HashMap<String, ChatClientController> clients = new HashMap<>();

    // rekisteröi uusi client
    public void registerClient(String username, ChatClientController controller) {
        clients.put(username, controller);
    }

    // lähetä viesti yhdeltä clientiltä toiselle
    public void sendMessage(String from, String to, String message) {
        ChatClientController recipient = clients.get(to);
        if (recipient != null) {
            recipient.receiveMessage(from, message);
        }
    }

    // hae kaikki käyttäjänimet
    public String[] getUsernames() {
        return clients.keySet().toArray(new String[0]);
    }
}
