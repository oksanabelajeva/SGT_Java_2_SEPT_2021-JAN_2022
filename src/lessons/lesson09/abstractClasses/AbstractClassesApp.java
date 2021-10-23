package lessons.lesson09.abstractClasses;

public class AbstractClassesApp {

    public static void main(String[] args) {

        Truck myTruck = new Truck();
        System.out.println(myTruck.calcFuelEfficiency());
        System.out.println(myTruck.showCurrentSpeed());
    }
}
