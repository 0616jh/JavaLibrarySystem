import java.util.ArrayList;


public class Library {
    private ArrayList<Book> bookInventory;
    private ArrayList<User> libraryUsers;

    public Library(ArrayList<Book> bookInventory, ArrayList<User> libraryUsers) {
        this.bookInventory = bookInventory;
        this.libraryUsers = libraryUsers;
    }

    // Getter Functions
    public ArrayList<Book> getBookInventory() {
        return bookInventory;
    }

    public ArrayList<User> getLibraryUsers() {
        return libraryUsers;
    }

    // Setter Functions
    public void setBookInventory(ArrayList<Book> bookInventory) {
        this.bookInventory = bookInventory;
    }

    public void setLibraryUsers(ArrayList<User> libraryUsers) {
        this.libraryUsers = libraryUsers;
    }

    public void addBook(Book book) {
        if (bookInventory.contains(book)) {
            System.out.println(book.getTitle() + " already exists in the inventory and cannot be added.");
        } else {
            bookInventory.add(book);
            System.out.println(book.getTitle() + " has been successfully added to the library.");
        }
    }

    public void removeBook(Book book) {
        if (!bookInventory.contains(book)) {
            System.out.println(book.getTitle() + " doesn't exist in the inventory. Nothing to remove.");
        } else if (bookInventory.contains(book) && !book.isInStock()) {
            System.out.println(book.getTitle() + " is currently checked out and cannot be removed until it is checked in again.");
        } else {
            bookInventory.remove(book);
            System.out.println(book.getTitle() + " has been successfully deleted from the inventory.");
        }
    }

    public void registerMember(User user) {
        if (libraryUsers.contains(user)) {
            System.out.println(user.getName() + " is already registered and cannot be added twice.");
        } else {
            libraryUsers.add(user);
            System.out.println(user.getName() + " has successfully been registered.");
        }
    }

    public void removeMember(User user) {
        if (!libraryUsers.contains(user)) {
            System.out.println(user.getName() + " is not a member, therefore, cannot be removed.");
        } else {
            libraryUsers.remove(user);
            System.out.println(user.getName() + " has been successfully removed from the library.");
        }
    }

    public void displayAvailableBooks() {
        for (Book book : bookInventory) {
            if (bookInventory.contains(book) && book.isInStock()) {
                book.displayBookDetails(book);
            }
        }
    }

    public void displayBorrowedBooks() {
        for (Book book : bookInventory) {
            if (bookInventory.contains(book) && !book.isInStock()) {
                book.displayBookDetails(book);
            }
        }
    }

    public void displayMemberDetails() {
        for (User user : libraryUsers) {
            user.displayUserDetails(user);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookInventory=" + bookInventory +
                ", libraryUsers=" + libraryUsers +
                '}';
    }
}
