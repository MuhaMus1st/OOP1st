import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList();

    public Library() {
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean borrowBook(String title) {
        Iterator var2 = this.books.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                System.out.println("Sorry, the book '" + title + "' is not available");
                return false;
            }

            book = (Book)var2.next();
        } while(!book.getTitle().equalsIgnoreCase(title) || !book.isAvailable());

        book.setAvailable(false);
        System.out.println("You have successfully borrowed the book '" + title + "'");
        return true;
    }

    public boolean returnBook(String title) {
        Iterator var2 = this.books.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                System.out.println("Sorry, the book '" + title + "' is not from this library");
                return false;
            }

            book = (Book)var2.next();
        } while(!book.getTitle().equalsIgnoreCase(title) || book.isAvailable());

        book.setAvailable(true);
        System.out.println("You have successfully returned '" + title + "'");
        return true;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        boolean anyAvailable = false;
        Iterator var2 = this.books.iterator();

        while(var2.hasNext()) {
            Book book = (Book)var2.next();
            if (book.isAvailable()) {
                PrintStream var10000 = System.out;
                String var10001 = book.getTitle();
                var10000.println("Title: " + var10001 + ", Author: " + book.getAuthor());
                anyAvailable = true;
            }
        }

        if (!anyAvailable) {
            System.out.println("No books are currently available.But I can give you one if you win me on 1 v 1 ");
        }

    }
}
