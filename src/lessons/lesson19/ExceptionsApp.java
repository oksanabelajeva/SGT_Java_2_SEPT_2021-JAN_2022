package lessons.lesson19;

import lessons.lesson19.exceptions.DBException;
import lessons.lesson19.exceptions.DBPasswordAllCapitalsException;
import lessons.lesson19.exceptions.DBPasswordIncorrectException;

public class ExceptionsApp {

    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();

        exceptions.divideByNumber(100, 50);

        try {
            exceptions.divideByNumber(999, 0);
        } catch (ArithmeticException e) {
            System.out.println("Handle the code somewhat differently.");
        }

        try {
            exceptions.multiplyByTwo(5);
        } catch (ArithmeticException e) {
            System.out.println("Even wrapped exceptions will be handled.");
        } finally {
            System.out.println("This block will always be called.");
        }

        System.out.println("If there is some other code after the try/catch/finally - it will still be executed.");

        try {
            System.out.println("Connecting to the Database");
            throw new DBPasswordAllCapitalsException();
        } catch (DBException e) {
            // handle this exception
            System.out.println("Our exception has been properly handled.");

            if (e instanceof DBPasswordAllCapitalsException) {
                System.out.println("Exception is of type DBPasswordAllCapitalsException.");
            } else if (e instanceof DBPasswordIncorrectException) {
                System.out.println("Password is incorrect.");
            }
        }

        try {
            throw new DBException("Some custom message.");
        } catch (DBException e) {
            System.out.println("There was a DB exception " + e.getMessage());
        }

        try {
            exceptions.multiplyByTwo(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Something after printing stacktrace.");

        boolean userAuthenticated = true;
        assert userAuthenticated;
        System.out.println("User is authenticated.");

        userAuthenticated = false;
        try {
            assert userAuthenticated;
        } catch (AssertionError e){
            System.out.println("User is not authenticated.");
        }
    }

    int method1() {
        try {
            System.out.println("Something");
            return 0;
        } catch (Exception e) {
            // more handling can be added here
            throw e;
        }
    }

    // method1 would be equal to method2
    int method2() throws Exception {
        System.out.println("Something");
        return 0;
    }
}
