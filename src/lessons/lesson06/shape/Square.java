package lessons.lesson06.shape;

public class Square extends Shape {

    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
