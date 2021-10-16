package lv.oxana.rocketscience;

import java.util.Scanner;

public class LaunchPad {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        System.out.println("There are so many rockets: " + Rocket.countRockets());

        System.out.println("Name of the rocket is " + rocket1.getName());
        System.out.println("Weight of the rocket is " + rocket1.getWeight());


        // NOT DO LIKE THIS
        Rocket rocket2 = rocket1;
        rocket1.setName("Starship");
        System.out.println("Name of the rocket 1 is " + rocket1.getName());
        System.out.println("Name of the rocket 2 is " + rocket2.getName()); // name will be Starship because rocket2 has the same place in memory as rocket 1
        // The order isn't important in this case.

        System.out.println("ID is " + rocket1.id);

        renameRocket(rocket1, "MoonRover");
        System.out.println("Name of the rocket 1 is " + rocket1.getName());
        System.out.println("Name of the rocket 2 is " + rocket2.getName());
        System.out.println("There are so many rockets: " + Rocket.countRockets());

        changeTheWeight(rocket1.getWeight(), 1000);
        System.out.println("The weight of the rocket stayed the same outside the method: " + rocket1.getWeight());

        rocket1.setWeight(1000);
        System.out.println("The weight is changed: " + rocket1.getWeight());

        Rocket rocket3 = new Rocket("Oxana's Ship", "Red", 100, 200, new Engine());
        rocket3.printRocketData();

        rocket3 = null;
        System.gc();

        Math.pow(2, 2);
    }

    /**
     * Renames the Rocket
     * Changes the original Object
     *
     * @param rocket
     * @param newName
     */
    private static void renameRocket(Rocket rocket, String newName) {
        rocket.setName(newName);
    }

    /**
     * Changes the weight only locally
     * DON'T DO LIKE THIS
     *
     * @param weight
     * @param newWeight
     */
    private static void changeTheWeight(int weight, int newWeight) {
        weight = newWeight;
        System.out.println("Weight was changed locally to " + weight);
    }
}