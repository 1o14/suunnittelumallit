package assignment18;

import java.util.ArrayList;
import java.util.List;

// Recommendation-luokka: kirjalista tietylle kohderyhmälle
public class Recommendation {
    private String targetAudience;
    private List<Book> books;

    // konstruktori
    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    // lisää kirja listaan
    public void addBook(Book book) {
        books.add(book);
    }

    // poista kirja listasta
    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }

    // muuta kohderyhmää
    public void setTargetAudience(String audience) {
        this.targetAudience = audience;
    }

    // clone-metodi: luo syväkopio (deep copy) koko suosituksesta
    public Recommendation clone() {
        Recommendation copy = new Recommendation(this.targetAudience);
        for (Book book : this.books) {
            copy.addBook(book.clone()); // kopioi jokainen kirja erikseen
        }
        return copy;
    }

    // tulostus suosituksesta
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target Audience: ").append(targetAudience).append("\n");
        for (int i = 0; i < books.size(); i++) {
            sb.append("  ").append(i + 1).append(". ").append(books.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}
