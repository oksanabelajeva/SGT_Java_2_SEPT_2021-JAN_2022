package lessons.lesson09.finalWordExplanation;

public class FinalMethods {

    private int someVar;

    // initialized during declaration
    final int CONSTANT_PI = 3;

    // non initialized during declaration
    // HAS TO be initialized in ALL constructors
    final int CONSTANT_NOINIT;

    public FinalMethods(){
        CONSTANT_NOINIT = 5;
    }

    public FinalMethods(int someVar) {
        this.someVar = someVar;
        CONSTANT_NOINIT = 6;
    }

    public FinalMethods(int someVar, int CONSTANT_NOINIT) {
        this.someVar = someVar;
        this.CONSTANT_NOINIT = CONSTANT_NOINIT;
    }

    public final void printHello(){
        System.out.println("Hello!");
    }
}

class ExtendedFinalMethods extends FinalMethods{

//    FINAL METHOD CAN NOT BE OVERRIDEN
//    @Override
//    public void printHello() {
//        System.out.println("Bye!");
//    }
}
