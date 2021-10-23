package lessons.lesson08.task3;

public class Task3App {
    public static void main(String[] args) {

        Employee employee = new Employee("Oxana", 34, "26000000", "Riga, Latvia", 1000d, "Lawyer");
        Manager manager = new Manager("Oxana B.", 35, "26111111", "Riga, Latvia", 1500d, "Court");
        System.out.println(employee.toString());
        System.out.println(manager.toString());
    }
}