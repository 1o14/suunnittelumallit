package assignment10;

// Abstrakti käsittelijäluokka
public abstract class FeedbackHandler {
    protected FeedbackHandler next;

    // asetetaan seuraava käsittelijä ketjussa
    public void setNext(FeedbackHandler next) {
        this.next = next;
    }

    // käsitellään viesti tai siirretään eteenpäin
    public void handle(Message message) {
        if (canHandle(message)) {
            process(message);
        } else if (next != null) {
            next.handle(message);
        } else {
            System.out.println("No handler found for message type: " + message.getType());
        }
    }

    // tarkistetaan voiko käsittelijä hoitaa viestin
    protected abstract boolean canHandle(Message message);

    // varsinainen käsittely
    protected abstract void process(Message message);
}
