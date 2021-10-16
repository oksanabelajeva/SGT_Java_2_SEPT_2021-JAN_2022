package lessons.lesson04.classTasks;

public class Scopes {

    static final int SOME_CONSTANT = 314;
    static int globalResult = 0;

    public static void main(String[] args) {

        int someNumber = SOME_CONSTANT;
        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);

        // BAD EXAMPLE
        // SOME CAN INTERFERE WITH GLOBAL VARIABLES
        multiplyAndStoreInGlobalVariable(15);
        multiplyByTwo(5);
        System.out.println("Global result is " + globalResult + ".");
    }

    static int scopeVisible(int someNumber) {
        boolean visibleInsideMethod = true;
        return someNumber * 2;
    }

    static int multiplyByFive(int number) {
        int five = SOME_CONSTANT;
        return number * five;
    }

    // AVOID USE GLOBAL VARIABLES
    static void multiplyAndStoreInGlobalVariable(int number) {
        int five = SOME_CONSTANT;
        globalResult = number * five;
    }

    static void multiplyByTwo(int number) {
        globalResult = number * 2;
    }
}