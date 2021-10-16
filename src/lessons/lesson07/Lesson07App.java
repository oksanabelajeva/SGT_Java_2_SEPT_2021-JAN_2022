package lessons.lesson07;

import lv.oxana.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson07App {

    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);
        PeopleSpaceShip peopleSpaceShip = new PeopleSpaceShip(new Engine(), "Escape Plan", 100,
                3, new ArrayList<String>());

        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        // add some cargo
        peopleSpaceShip.addCargo();
        // should return Integer
        peopleSpaceShip.addCargo(200);

        System.out.println(peopleSpaceShip);
        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip);

        // just prints "Cargo added."
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();

        //will print "Cargo added." and "We have overriden method inside PeopleSpaceShip"
        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();

        // UPCASTING, automatically as the SpaceShip castedSpaceShip = (SpaceShip) peopleSpaceShip;
        SpaceShip castedSpaceShip = peopleSpaceShip;

        // DOWNCASTING, manually
        // CAN NOT be used because "spaceShip" can not be null (it's an exception)
//        PeopleSpaceShip castedPeopleSpaceShip = (PeopleSpaceShip) spaceShip;
//        castedPeopleSpaceShip.getNamesOfPeople();

    }

    public static void printInfoAboutSpaceShip(SpaceShip spaceShip) {
        System.out.println("I have a SpaceShip: " + spaceShip);
    }
}