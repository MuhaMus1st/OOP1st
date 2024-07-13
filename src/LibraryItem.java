public abstract class LibraryItem {
    private String name;
    private String id;

    public LibraryItem(int i, String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Integer.parseInt(id);
    }

    public abstract void displayDetails();
}
