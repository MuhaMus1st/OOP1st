public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add a new book
        Book book = new Book(1, "1984", "George Orwell");
        library.addBook(book);

        // Retrieve and display the book
        Book retrievedBook = library.getBook(1);
        if (retrievedBook != null) {
            System.out.println("Retrieved Book: " + retrievedBook.getTitle() + " by " + retrievedBook.getAuthor());
        }

        // Update the book
        book.setTitle("Nineteen Eighty-Four");
        library.updateBook(book);

        // Delete the book
        library.deleteBook(1);
    }
}
