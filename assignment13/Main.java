package assignment13;

// Testataan vierailijoita
public class Main {
    public static void main(String[] args) {
        // Luodaan hakemistorakenne
        Directory root = new Directory("root");
        Directory docs = new Directory("docs");
        Directory images = new Directory("images");

        File file1 = new File("report.pdf", 5);
        File file2 = new File("photo.jpg", 3);
        File file3 = new File("notes.txt", 2);
        File file4 = new File("diagram.png", 4);

        docs.add(file1);
        docs.add(file3);
        images.add(file2);
        images.add(file4);
        root.add(docs);
        root.add(images);

        // Vierailija: koko
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        // Vierailija: haku
        SearchVisitor searchVisitor = new SearchVisitor(".jpg");
        root.accept(searchVisitor);
        System.out.println("Matched files:");
        for (File f : searchVisitor.getMatchedFiles()) {
            System.out.println("- " + f.getName());
        }
    }
}
