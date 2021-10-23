package lessons.lesson09.abstractClasses;

public abstract class Vehicle {

    public abstract double calcFuelEfficiency();

    public double showCurrentSpeed(){
        return Math.random()*100;
    }
}
