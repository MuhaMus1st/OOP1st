public class Magazine extends LibraryItem {
    private String issueNumber;

    public Magazine(String name, String id, String issueNumber) {
        super(name, id);
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine ID: " + getId());
        System.out.println("Title: " + getName());
        System.out.println("Issue Number: " + issueNumber);
    }
}
