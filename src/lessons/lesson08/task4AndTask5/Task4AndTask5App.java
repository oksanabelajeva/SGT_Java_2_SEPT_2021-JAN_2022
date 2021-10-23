package lessons.lesson08.task4AndTask5;

public class Task4AndTask5App {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(5);

        System.out.println(rectangle.calculateAndPrintArea(rectangle.getHeight(), rectangle.getBreadth()) + " (rectangle).");
        System.out.println(rectangle.calculateAndPrintPerimeter(rectangle.getHeight(), rectangle.getBreadth()) + " (rectangle).");
        System.out.println(square.calculateAndPrintArea(square.getHeight(), square.getBreadth()) + " (square).");
        System.out.println(square.calculateAndPrintPerimeter(square.getHeight(), square.getBreadth()) + " (square).");

        Square square2 = new Square(6);
        Square square3 = new Square(7);
        Square square4 = new Square(8);
        Square square5 = new Square(9);
        Square square6 = new Square(10);
        Square square7 = new Square(4);
        Square square8 = new Square(3);
        Square square9 = new Square(2);
        Square square10 = new Square(1);

        Square [] tenSquares = {square, square2, square3, square4, square5, square6, square7,
                square8, square9, square10};

        for (Square squareToBePrinted : tenSquares){
            System.out.println(squareToBePrinted.calculateAndPrintArea(squareToBePrinted.getHeight(), squareToBePrinted.getBreadth()) + " (square).");
        }
    }
}