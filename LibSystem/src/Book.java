public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private boolean inStock;

    public Book(String title, String author, String ISBN, String genre, boolean inStock) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.inStock = inStock;
    }

    // Getter Functions
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isInStock() {
        return inStock;
    }

    // Set inStock value
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void displayBookDetails(Book book) {
        System.out.println("=".repeat(100));
        System.out.println("Details for " + book.getTitle().toUpperCase());
        System.out.println("=".repeat(100));
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Availability: " + (book.inStock ? "Available " : "Not Available "));
        System.out.println("=".repeat(100));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genre='" + genre + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
