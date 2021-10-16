package lessons.lesson01.helloWorld;

import lessons.lesson01.helloWorldLibrary.WorldLibrary;

public class HelloWorld {

    public static void main(String[] args) {

        WorldLibrary worldLibrary = new WorldLibrary();
        System.out.println(worldLibrary.getName() + ", welcome to JAVA2!");

        worldLibrary.setPlanetName("Earth");
        System.out.println("I live on a planet named " + worldLibrary.getPlanetName() + ".");

        worldLibrary.setPlanetName("Mars");
        System.out.println("But now I've decided to go to " + worldLibrary.getPlanetName() + ".");

        LocalLibrary localLibrary = new LocalLibrary();
        System.out.println("I will use schema " + localLibrary.getSchematics() + ".");
    }
}
