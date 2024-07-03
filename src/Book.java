public class Book extends LibraryItem {
    private String author;
    private boolean isAvailable;

    public Book(String name, String id, String author) {
        super(name, id);
        this.author = author;
        this.isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + getId());
        System.out.println("Title: " + getName());
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}
