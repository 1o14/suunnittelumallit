package assignment13;

import java.util.ArrayList;
import java.util.List;

// Kansio, voi sisältää tiedostoja ja kansioita
public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemElement element) {
        children.add(element); // Lisätään sisältöä
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this); // Vierailija käy kansiossa
        for (FileSystemElement child : children) {
            child.accept(visitor); // Vierailija käy sisällössä
        }
    }
}
