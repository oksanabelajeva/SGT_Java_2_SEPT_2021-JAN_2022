package lesson04.classTasks;

public class ControlFlows {

    //BRANCHING

    public static void main(String[] args) {
        int myAge = 34;
        System.out.println();

        // SIMPLE IF STATEMENT
        if (myAge > 64) {
            System.out.println("Retirement time.\n");
        } else if (myAge < 7 && myAge > 0) {
            System.out.println("Kinder garden time.\n");
        } else {
            System.out.println("Work time or you aren't born yet!\n");
        }

        // SWITCH STATEMENTS
        switch (myAge) {
            case 5:
                System.out.println("Five years old.\n");
                break;
            case 34:
                System.out.println("Thirty four years old.\n");
                break;
            case 55:
                System.out.println("Fifty five years old.\n");
                break;
            default:
                System.out.println("Some other non-mentioned age.\n");
        }

        // SIMPLE FOR LOOP
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " - Are you finished yet?");
        }
        System.out.println("Finally!\n");

        // PRINT SIMPLE FOREACH EXAMPLE
        String[] students = new String[5];
        students[0] = "Laura";
        students[1] = "Jekaterina";
        students[2] = "Marina";
        students[3] = "Tatjana";
//        students[4] = "Oxana\n";

        for (String studentName : students) {
            System.out.println(studentName);
        }
        System.out.println();

        // WHILE LOOP
        int i = 0;
        while (i < 20) {
            System.out.print("Loop is still running " + i + ".\n");
            i++;
        }
        System.out.println();

        // DO WHILE LOOP is running at least once; here i = 20 (after WHILE LOOP)
        do {
            System.out.println("This should be executed at least once.");
        } while (i < 0);
        System.out.println();

        // INFINITE LOOP WITH BREAK
        // We will stop the loop when breakCondition is > 10
        int breakCondition = 0;
        do {
            if (breakCondition > 10){
                break;
            }
            breakCondition++;
            System.out.println("Break condition: " + breakCondition);
        } while (true);
        System.out.println("We are out of infinite loop.\n");

        // A loop where we keep elements from 3 to 7
        for (int j = 0; j < 10; j++) {
            if (j > 2 && j < 8){
                continue;
            }
            System.out.println("Some element that is not between 3 and 7 not included: " + j);
        }
    }
}
