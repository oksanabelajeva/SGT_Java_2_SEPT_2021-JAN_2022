package lessons.lesson03.syntax;

public class Conditionals {
    public static void main(String[] args) {
        String myName = "Oxana";

        if (myName == "Oxana") {
            System.out.println("You have a nice name, Oxana!");
        } else {
            System.out.println("Please check your name.");
        }
        String isMyNameOxana = myName == "Maria" ? "You have a nice name, Oxana!" : "Please check your name.";
        System.out.println(isMyNameOxana);

        System.out.println(oddOrEvenFirst(7));
        System.out.println(oddOrEvenSecond(4));
        oddOrEvenThree(5);
    }

    public static String oddOrEvenFirst(int number) {
        if (number % 2 == 0) {
            return "The number is even.";
        } else {
            return "The number is odd.";
        }
    }

    public static String oddOrEvenSecond(int number) {
        return number % 2 == 0 ? "The number is even." : "The number is odd.";
    }

    public static String oddOrEvenThree(int number) {
        String result = number % 2 == 0 ? "The number is even." : "The number is odd.";
        System.out.println(result);
        return result;
    }
}