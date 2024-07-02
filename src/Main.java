public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("Menin atim kozha", "Berdibek Sokpakbayev"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));


        library.displayAvailableBooks();


        library.borrowBook("Menin atim kozha");


        library.borrowBook("Menin atim kozha");


        library.returnBook("Menin atim kozha");


        library.displayAvailableBooks();
    }
}
