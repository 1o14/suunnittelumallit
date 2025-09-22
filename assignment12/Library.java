package assignment12;

import java.util.HashMap;
import java.util.Map;

// Dokumenttikirjasto
public class Library {
    private Map<String, Document> documents = new HashMap<>();

    public void addUnprotectedDocument(String id, String date, String content) {
        documents.put(id, new RealDocument(id, date, content)); // Ei suojausta
    }

    public void addProtectedDocument(String id, String date, String content, String allowedUser) {
        RealDocument realDoc = new RealDocument(id, date, content);
        AccessControlService.getInstance().allow(id, allowedUser); // Sallitaan käyttäjä
        documents.put(id, new DocumentProxy(realDoc)); // Tallennetaan proxy
    }

    public Document getDocument(String id) {
        return documents.get(id); // Haetaan dokumentti
    }
}
