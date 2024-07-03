public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books and magazines to the library , so we can read or else you get what what
        library.addItem(new Book("The Great Gatsby", "B001", "F. Scott Fitzgerald"));
        library.addItem(new Book("1984", "B002", "George Orwell"));
        library.addItem(new Book("Menin atim kozha", "C003", "Berdibek Sokpakbayev"));
        library.addItem(new Magazine("National Geographic", "M001", "June 2023"));
        library.addItem(new Magazine("Time", "M002", "July 2023"));

        library.displayAllItems();

        library.displayAvailableBooks();

        library.borrowBook("B002");

        library.borrowBook("B002");

        library.returnBook("B002");

        library.displayAvailableBooks();
    }
}

