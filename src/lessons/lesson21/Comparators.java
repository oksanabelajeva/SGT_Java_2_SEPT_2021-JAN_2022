package lessons.lesson21;

import java.util.*;

public class Comparators {

    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>();
        Student student1 = new Student(1, "Smart");
        Student student2 = new Student(2, "Clever");
        Student student3 = new Student(3, "Pretty");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);
    }
}

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // We are comparing students by second character of their name
    @Override
    public int compareTo(Student student) {

        if (student.name.charAt(1) < this.name.charAt(1)) {
            return 1;
        } else if (student.name.charAt(1) > this.name.charAt(1)) {
            return -1;
        } else {
            return 0;
        }
    }
}
