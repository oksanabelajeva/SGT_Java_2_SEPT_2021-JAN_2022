package lessons.lesson09.interfaceExamples;

public class Zvirbulis implements FlyableInterface{

    @Override
    public void fly(int height) {
        System.out.println("I am flying so high " + height + ".");
    }
}
