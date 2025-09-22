package assignment13;

import java.util.ArrayList;
import java.util.List;

// Etsii tiedostoja nimen perusteella
public class SearchVisitor implements FileSystemVisitor {
    private String keyword;
    private List<File> matchedFiles = new ArrayList<>();

    public SearchVisitor(String keyword) {
        this.keyword = keyword;
    }

    public List<File> getMatchedFiles() {
        return matchedFiles;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(keyword)) {
            matchedFiles.add(file); // Jos nimi täsmää, lisätään
        }
    }

    @Override
    public void visit(Directory dir) {
        // Ei tehdä mitään kansiolle itsessään
    }
}
