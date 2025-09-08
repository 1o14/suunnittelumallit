package assignment10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // luodaan käsittelijäketju
        FeedbackHandler compensation = new CompensationHandler();
        FeedbackHandler contact = new ContactHandler();
        FeedbackHandler suggestion = new SuggestionHandler();
        FeedbackHandler general = new GeneralHandler();

        // ketjutetaan käsittelijät
        compensation.setNext(contact);
        contact.setNext(suggestion);
        suggestion.setNext(general);

        // luodaan viestejä
        List<Message> messages = List.of(
            new Message(MessageType.CONTACT, "Please call me back", "user1@example.com"),
            new Message(MessageType.SUGGESTION, "Add dark mode", "user2@example.com"),
            new Message(MessageType.COMPENSATION, "I want a refund", "user3@example.com"),
            new Message(MessageType.GENERAL, "Great service!", "user4@example.com")
        );

        // käsitellään viestit
        for (Message msg : messages) {
            compensation.handle(msg); // aloitetaan ketjun alusta
            System.out.println("---");
        }
    }
}
