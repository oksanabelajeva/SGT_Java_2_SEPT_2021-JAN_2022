package lessons.lesson08.task4AndTask5;

public class Rectangle {

    private int height;
    private int breadth;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.breadth = width;
    }

    public static int calculateAndPrintArea(int height, int breadth) {
        System.out.print("The area is: ");
        return height * breadth;
    }

    public static int calculateAndPrintPerimeter(int height, int breadth) {
        System.out.print("The perimeter is: ");
        return (height + breadth) * 2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
