package assignment18;

// Book-luokka: yksittäinen kirja
public class Book {
    private String author;
    private String title;
    private String genre;
    private int publicationYear;

    // konstruktori
    public Book(String author, String title, String genre, int publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    // clone-metodi: luo kopio kirjasta
    public Book clone() {
        return new Book(author, title, genre, publicationYear);
    }

    // tulostus kirjan tiedoista
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + genre + ", " + publicationYear + ")";
    }
}
