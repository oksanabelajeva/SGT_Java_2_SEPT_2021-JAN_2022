package lessons.lesson09.nestedClasses;

public class NestedClasses {

    static public class InnerClass{
        public String printInnerClass(){
            return "This is Inner class.";
        }
    }

    private String printSomethingFromNestedClass(){
        InnerClass inner = new InnerClass();
        return inner.printInnerClass();
    }
}
