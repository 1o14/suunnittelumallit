package assignment13;

// Tiedosto, jolla nimi ja koko
public class File implements FileSystemElement {
    private String name;
    private int sizeMB;

    public File(String name, int sizeMB) {
        this.name = name;
        this.sizeMB = sizeMB;
    }

    public String getName() {
        return name;
    }

    public int getSizeMB() {
        return sizeMB;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this); // Vierailija käy tiedostossa
    }
}
