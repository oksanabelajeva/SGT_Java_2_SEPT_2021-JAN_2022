package lessons.lesson08.task7;

public class TestBook {

    public static void main(String[] args) {

        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        // Use an anonymous instance of Author
        Book anotherBook = new Book("more Java for dummy", new Author("Name of Book",
                "email@author.com", 'f'), 29.95, 888);

        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println(aBook);
        System.out.println(anotherBook);
    }
}
