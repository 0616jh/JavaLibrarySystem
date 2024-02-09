import java.util.ArrayList;

public class User {
    private String name;
    private String userId;
    private String address;
    private String phone;
    private ArrayList<Book> booksBorrowed;

    public User(String name, String userId, String address, String phone, ArrayList<Book> booksBorrowed) {
        this.name = name;
        this.userId = userId;
        this.address = address;
        this.phone = phone;
        this.booksBorrowed = booksBorrowed;
    }

    // Getter Functions
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    // Setter Functions
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(ArrayList<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public void displayUserDetails(User user) {
        System.out.println("=".repeat(100));
        System.out.println("Details for: " + user.getName().toUpperCase());
        System.out.println("=".repeat(100));
        System.out.println("Name: " + user.getName());
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("=".repeat(100));
        System.out.println();
    }

    public void checkOutBook(Book book) {

         if (!book.isInStock() && booksBorrowed.contains(book)) {
            System.out.println(book.getTitle() + " is currently out for rental and cannot be checked out");
        } else {
            booksBorrowed.add(book);
            book.setInStock(false);
            System.out.println(book.getTitle() + " has been successfully checked out.");

        }
    }

    public void returnBook(Book book) {
        if (booksBorrowed.contains(book)) {
            booksBorrowed.remove(book);
            book.setInStock(true);
            System.out.println(book.getTitle() + " has been successfully returned");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", booksBorrowed=" + booksBorrowed +
                '}';
    }
}
