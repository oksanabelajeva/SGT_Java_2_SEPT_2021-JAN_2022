package lesson03.syntax;

public class Statics {
    private String name;
    private static String surname = "Belyaeva";

    public Statics() {
    }

    public Statics(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Statics.surname = surname;
    }
}

class Animal {
    private String name;
    private String voice;
    private static int number;

    static {
        System.out.println("Class Animal is loaded.");
    }

    public Animal() {
        number++;
        System.out.println("Another animal created. Total: " + getNumber() + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Animal.number = number;
    }
}

class Run {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();
    }
}