public class Book {

    private final String name;
    private int yearPublishing;

    public Book(String name, int yearPublishing) {
        this.name = name;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}