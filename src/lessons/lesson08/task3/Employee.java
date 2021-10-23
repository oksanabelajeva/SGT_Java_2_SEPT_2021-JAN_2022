package lessons.lesson08.task3;

public class Employee extends Members {

    private String specialization;

    public Employee() {
    }

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }
}
