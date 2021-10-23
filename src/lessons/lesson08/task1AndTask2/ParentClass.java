package lessons.lesson08.task1AndTask2;

public class ParentClass {

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();

        parentClass.printThisIsParentClass();
        childClass.printThisIsChildClass();
        childClass.printThisIsParentClass();
    }

    public static void printThisIsParentClass(){
        System.out.println("This is parent class");
    }
}
