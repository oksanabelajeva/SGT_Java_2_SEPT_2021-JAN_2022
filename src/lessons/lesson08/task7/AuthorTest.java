package lessons.lesson08.task7;

public class AuthorTest {

    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor); // call toString()
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
    }
}
