import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public boolean borrowBook(String id) {
        for (LibraryItem item : items) {
            if (item instanceof Book && item.getId().equalsIgnoreCase(id)) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have successfully borrowed '" + book.getName() + "'");
                    return true;
                } else {
                    System.out.println("Sorry, the book '" + book.getName() + "' is not available.");
                    return false;
                }
            }
        }
        System.out.println("Sorry, the book with ID '" + id + "' is not found.");
        return false;
    }

    public boolean returnBook(String id) {
        for (LibraryItem item : items) {
            if (item instanceof Book && item.getId().equalsIgnoreCase(id)) {
                Book book = (Book) item;
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You have successfully returned '" + book.getName() + "'");
                    return true;
                } else {
                    System.out.println("The book '" + book.getName() + "' was not borrowed");
                    return false;
                }
            }
        }
        System.out.println("Sorry, the book with ID '" + id + "' is not found.Try again later and buy our newest pass");
        return false;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books: ");
        boolean anyAvailable = false;
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    System.out.println("ID: " + book.getId() + ", Title: " + book.getName() + ", Author: " + book.getAuthor());
                    anyAvailable = true;
                }
            }
        }
        if (!anyAvailable) {
            System.out.println("No books are currently available.Sorry");
        }
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println();
        }
    }
}
