package assignment12;

// Oikea dokumentti, voi olla suojattu tai ei
public class RealDocument implements Document {
    private String id;
    private String creationDate;
    private String content;

    public RealDocument(String id, String creationDate, String content) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content; // Ei suojauksia tässä
    }
}
