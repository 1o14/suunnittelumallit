package assignment13;

// Yhteinen rajapinta tiedostoille ja kansioille
public interface FileSystemElement {
    void accept(FileSystemVisitor visitor); // Vierailija käy elementissä
}
