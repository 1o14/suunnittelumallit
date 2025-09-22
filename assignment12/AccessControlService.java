package assignment12;
import java.util.HashSet;
import java.util.Set;

// Yksi instanssi, tarkistaa oikeudet
public class AccessControlService {
    private static AccessControlService instance = new AccessControlService();
    private Set<String> allowedPairs = new HashSet<>();

    private AccessControlService() {}

    public static AccessControlService getInstance() {
        return instance;
    }

    public void allow(String documentId, String username) {
        allowedPairs.add(documentId + ":" + username); // Tallennetaan sallittu pari
    }

    public boolean isAllowed(String documentId, String username) {
        return allowedPairs.contains(documentId + ":" + username); // Tarkistetaan oikeus
    }
}
