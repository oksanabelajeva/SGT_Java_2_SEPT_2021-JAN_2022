package lessons.lesson03.syntax;

public class Floats {
    final static float PI = 3.14f;

    public static void main(String[] args) {

        Float simpleFloat = 3.14159265359f;
        Double simpleDouble = 3.141592653589793238462643383279502884197169399375105820974944592307816406286d;

        float radius = 5.5f;
        double diameter = 28.123d;

        float result = circlePerimeter(radius);
        System.out.println("When radius is " + radius + ", the perimeter is " + result + ".");
        System.out.println("When radius is " + radius + ", the area is " + circleArea(radius) + ".");

    }

    static float circlePerimeter(float radius) {
        return 2 * PI * radius;
    }

    static float circleArea(float radius) {
//        return PI * radius * radius;
        return PI*(float)(Math.pow(radius, 2));
    }
}


