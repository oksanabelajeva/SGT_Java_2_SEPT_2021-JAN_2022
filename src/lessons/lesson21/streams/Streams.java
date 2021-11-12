package lessons.lesson21.streams;

import java.util.Scanner;

public class Streams {

    public static void main(String[] args) {

        // STDOUT
        System.out.println("This is System STDOUT.");

        // STDIN
        Scanner scanner = new Scanner(System.in);
        String sysIn = scanner.next();

        // STDERR
        // throw new Exception("Throwing exception into STDERR stream");
    }
}
