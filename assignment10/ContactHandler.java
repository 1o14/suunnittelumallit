package assignment10;

// Käsittelee yhteydenottopyynnöt
public class ContactHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.CONTACT;
    }

    @Override
    protected void process(Message message) {
        System.out.println("Contact request forwarded: " + message.getContent());
        System.out.println("Contacted: " + message.getSenderEmail());
    }
}
