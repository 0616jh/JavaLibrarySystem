import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Empty ArrayLists for instantiations
        ArrayList<Book> testBooks = new ArrayList<Book>();
        ArrayList<User> testUserGroup = new ArrayList<User>();

        // Books
        Book testBook = new Book("Test", "Test", "Test", "Test", true);
        Book testBook2 = new Book("Test2", "Test2", "Test2", "Test2", true);
        Book testBook3 = new Book("Test3", "Test2", "Test2", "Test2", true);
        Book testBook4 = new Book("Cracking the Coding Interview, 6th Edition",
                "GayleL. McDowell", "978-0-9847828-5-7", "Programming", true);
        Book testBook5 = new Book("The Algorithm Design Manual", "Steven S. Skiena",
                "978-1-84800-069-8", "Data Structures & Algorithms", true);

        // Users
        User testUser = new User("Josh", "jh123",
                "135 S. Stone Ave Tucson, AZ 85701", "555-555-5555", testBooks);
        User testUser2 = new User("Some Person", "someperson123",
                "1234 Melrose Ave, Los Angeles, CA 90210", "555-674-9205", testBooks);
        User testUser3 = new User("FirstName LastName", "flname2024", "1234 Pacific Coast Highway," +
                " Long Beach, CA 90052", "555-555-5555", testBooks);

        // Library
        Library theTestLibrary = new Library(testBooks, testUserGroup);

        // Registering members
        theTestLibrary.registerMember(testUser);
        theTestLibrary.registerMember(testUser2);
        theTestLibrary.registerMember(testUser3);

        // Removing members
        theTestLibrary.removeMember(testUser3);

        // Adding books
        theTestLibrary.addBook(testBook);
        theTestLibrary.addBook(testBook2);
        theTestLibrary.addBook(testBook3);
        theTestLibrary.addBook(testBook4);
        theTestLibrary.addBook(testBook5);

        // Deleting books
        theTestLibrary.removeBook(testBook3);

        // Checking out books
        testUser2.checkOutBook(testBook);
        testUser.checkOutBook(testBook2);
        testUser.checkOutBook(testBook4);
        testUser.checkOutBook(testBook5);

        // Returning books
        testUser2.returnBook(testBook);
        testUser.returnBook(testBook2);

        // Unavailable Books
        theTestLibrary.displayBorrowedBooks();

        // Available Books
        theTestLibrary.displayAvailableBooks();

        // Display Member Details
        theTestLibrary.displayMemberDetails();

    }
}