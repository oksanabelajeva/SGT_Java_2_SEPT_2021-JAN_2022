package lessons.lesson07;

import lv.oxana.rocketscience.Engine;

import java.util.ArrayList;

public class PeopleSpaceShip extends SpaceShip {

    private int numberOfPeople;
    private ArrayList<String> namesOfPeople = new ArrayList<>();

    public PeopleSpaceShip() {
        super();
    }

    public PeopleSpaceShip(int numberOfPeople, ArrayList<String> namesOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public PeopleSpaceShip(Engine engine, String name, int cargoSpace, int numberOfPeople, ArrayList<String> namesOfPeople) {
        super(engine, name, cargoSpace);
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public ArrayList<String> getNamesOfPeople() {
        return namesOfPeople;
    }

    public void setNamesOfPeople(ArrayList<String> namesOfPeople) {
        this.namesOfPeople = namesOfPeople;
    }

    @Override
    public String toString() {
        return "PeopleSpaceShip{" +
                "numberOfPeople=" + numberOfPeople +
                ", namesOfPeople=" + namesOfPeople +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                ", cargoSpace=" + cargoSpace +
                "} " + super.toString();
    }

    @Override
    public void addCargo() {
        super.addCargo();
        System.out.println("We have overriden method inside PeopleSpaceShip.");
    }
}
