package assignment13;

// Laskee tiedostojen kokonaiskoon
public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSizeMB(); // Lisätään tiedoston koko
    }

    @Override
    public void visit(Directory dir) {
        // Ei tehdä mitään kansiolle itsessään
    }
}
