package lesson04.classTasks;

public class References {

    public static void main(String[] args) {
        // THIS WILL POINT TO NULL
        String someString;

        // THESE TWO LINES ARE IDENTICAL
        someString = "Something";
        someString = new String("Something");

        Point pointOne = new Point(7, 11);
        System.out.println("Coordinates of point one: " + pointOne.getX() + ", " + pointOne.getY());

        Point pointTwo = pointOne;

        Point pointThree = new Point(0, 0);
        pointThree.setX(pointOne.getX());
        pointThree.setY(pointOne.getY());

        System.out.println("Coordinates of point two: " + pointTwo.getX() + ", " + pointTwo.getY());

        pointTwo.setX(100);
        System.out.println("Coordinates of point two: " + pointTwo.getX() + ", " + pointTwo.getY());
        System.out.println("Coordinates of point one: " + pointOne.getX() + ", " + pointOne.getY());
        System.out.println("Coordinates of point three: " + pointThree.getX() + ", " + pointThree.getY());
    }
}

class Point {
    // coordinates
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}