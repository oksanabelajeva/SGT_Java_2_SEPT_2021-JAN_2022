package lessons.lesson03.syntax;

import lessons.lesson01.helloWorldLibrary.WorldLibrary;

public class Lesson03 {
    final String SOME_CONSTANT = "constant"; // can not be overwritten
    final float PI = 3.14f;

    public static void main(String[] args) {
        RocketShip rocketShip = new RocketShip();
        rocketShip.fly(10);

        Bird bird = new Bird();
        bird.fly(1);

        Penguin penguin = new Penguin();
        penguin.fly(0);
        penguin.walk(5);

        if (penguin instanceof Penguin) {
            System.out.println("Penguin is a penguin.");
        }
        if (penguin instanceof Bird) {
            System.out.println("Penguin is a bird.");
        }

        int result = 2;
        result += 5;
        System.out.println("Result is " + result + ".");

        Statics statics = new Statics();
        statics.setName("Oxana");
        System.out.println("My name is " + statics.getName() + ".");
        System.out.println("My surname is " + Statics.getSurname() + ".");
    }

    public static String boop() {
        return WorldLibrary.getName();
    }
}

enum RocketTypes {
    BEZOS,
    MUSK,
    BRANSON
}

interface CanFlyInterface {
    boolean fly(int speed);
}

class RocketShip implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Whoosh, I am flying!");
        return false;
    }
}

class Bird implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Chirp, chirp, I am flying!");
        return false;
    }
}

class Penguin extends Bird {

    public boolean walk(int speed) {
        System.out.println("Quack, quack!");
        return true;
    }
}