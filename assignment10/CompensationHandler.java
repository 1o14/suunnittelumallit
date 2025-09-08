package assignment10;

// Käsittelee korvausvaatimukset
public class CompensationHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.COMPENSATION;
    }

    @Override
    protected void process(Message message) {
        System.out.println("Compensation claim reviewed: " + message.getContent());
        System.out.println("Decision sent to: " + message.getSenderEmail());
    }
}
