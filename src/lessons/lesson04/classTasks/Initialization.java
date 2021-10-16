package lessons.lesson04.classTasks;

public class Initialization {

    public static void main(String[] args) {
        // BAD EXAMPLE, DON'T DO LIKE THIS!!!
        String boopOrWoop; // pointing to NULL
        boopOrWoop = boop();

        // GOOD EXAMPLE, DO LIKE THIS
        String boopOrWoopOne = boop();
    }

    static String boop() {
        return "boop";
    }

    static String woop() {
        return "woop";
    }
}