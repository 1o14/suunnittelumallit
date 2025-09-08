package assignment10;

// Käsittelee yleisen palautteen
public class GeneralHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.GENERAL;
    }

    @Override
    protected void process(Message message) {
        System.out.println("General feedback analyzed: " + message.getContent());
        System.out.println("Response sent to: " + message.getSenderEmail());
    }
}
