package main.java.by.shilay;

public class Book {
    private String title;
    private String yearPublishing;
    private Author author;
    private Genre genre;
    private Library library;
    private int numberPages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(String yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
}
