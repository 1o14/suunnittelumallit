package assignment12;

// Proxy suojatulle dokumentille
public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private AccessControlService accessControl;

    public DocumentProxy(RealDocument realDocument) {
        this.realDocument = realDocument;
        this.accessControl = AccessControlService.getInstance(); // Singleton
    }

    @Override
    public String getCreationDate() {
        return realDocument.getCreationDate(); // Luontipäivä aina näkyvissä
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (accessControl.isAllowed(realDocument.getId(), user.getUsername())) {
            return realDocument.getContent(user); // Jos sallittu, näytetään sisältö
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }
}
