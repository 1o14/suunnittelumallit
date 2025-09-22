package assignment13;

// Vierailijan rajapinta
public interface FileSystemVisitor {
    void visit(File file);      // Käynti tiedostossa
    void visit(Directory dir);  // Käynti kansiossa
}
