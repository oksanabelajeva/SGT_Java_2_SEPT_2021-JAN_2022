package lessons.lesson03.syntax;

public class Casts {

    public static void main(String[] args) {
        int justAnInteger = 50000;
        System.out.println(justAnInteger);
        System.out.println((long) justAnInteger);
        System.out.println((short) justAnInteger); //wrong value is sout

        if (justAnInteger > 32768 || justAnInteger < -32768) {
            System.out.println(justAnInteger);
        } else {
            System.out.println((short) justAnInteger);
        }

        System.out.println("PI is just a " + (int) 3.14f + ".");
    }
}
