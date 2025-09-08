package assignment10;

// Käsittelee kehitysehdotukset
public class SuggestionHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.SUGGESTION;
    }

    @Override
    protected void process(Message message) {
        System.out.println("Suggestion logged: " + message.getContent());
        System.out.println("Thanked: " + message.getSenderEmail());
    }
}
