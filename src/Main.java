public class Main {

    public static void main(String[] args) {
        Book book = new Book("Тень и кость", 2021);
        Author book1 = new Author("Ли", "Бардуго");
        book.setYearPublishing(2000);
        System.out.println("Книга под названием " + book.getName() + " "
                + book.getYearPublishing() + " года издания");
        System.out.println("Автор - " + book1.getFirstName() + " " + book1.getSurname() + ".");

        Book book2 = new Book("Война и мир", 1869);
        Author book3 = new Author("Лев", "Толстой");
        System.out.println("Книга под названием " + book2.getName() + " "
                + book2.getYearPublishing() + " года издания");
        System.out.println("Автор - " + book3.getFirstName() + " " + book3.getSurname() + ".");
    }
}