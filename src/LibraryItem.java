public abstract class LibraryItem {
    private String name;
    private String id;

    public LibraryItem(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public abstract void displayDetails();
}
