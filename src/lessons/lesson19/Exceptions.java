package lessons.lesson19;

public class Exceptions {

    public double multiplyByTwo(double someNumber) {
        this.divideByNumber(7, 0);
        return someNumber * 2;
    }

    // return 0 OR throw e - depends on where the error should be caught:
    // by developer or user
    public double divideByNumber(int dividable, int divider) throws ArithmeticException {
        try {
            return dividable / divider;
        } catch (ArithmeticException e) {
            System.out.println("There was an arithmetic exception. The text is: " + e.getMessage());
            throw e;
        }
    }
}
