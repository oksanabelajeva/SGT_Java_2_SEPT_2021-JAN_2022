package lessons.lesson05;

public class BankAccount {

    // EXPLANATION why variables should be private
    public static void main(String[] args) {
        BankTransaction bankTransaction = new BankTransaction();
        bankTransaction.sendMoney(50);
        bankTransaction.sendMoney(55);
        System.out.println("Money remaining: " + bankTransaction.balance);

        bankTransaction.balance = 1000000000;
        System.out.println("Money remaining: " + bankTransaction.balance);
    }
}

class BankTransaction {

    public int balance = 100;

    public void sendMoney(int money) {
        if (balance - money >= 0) {
            balance = balance - money;
            System.out.println("Money was sent.");
        } else {
            System.out.println("Not enough money.");
        }
    }
}