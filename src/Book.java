public class Book extends LibraryItem {
    private String author;
    private boolean isAvailable;
    private String title ;

    public Book(int name, String id, String author, String title) {
        super(Integer.parseInt(id), String.valueOf(name), id);
        this.author = author;
        this.isAvailable = true;
        this.title = title;
    }

    public Book(int id, String title, String author) {
        super(id,title,author);
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

    public String getTitle() {
        return title ;
    }

    public void setTitle(String s) {
        title = this.title ;
    }
}
