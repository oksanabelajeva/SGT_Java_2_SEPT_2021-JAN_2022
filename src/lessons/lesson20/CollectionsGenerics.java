package lessons.lesson20;

import java.util.ArrayList;
import java.util.List;

public class CollectionsGenerics {

    public static void main(String[] args) {

        // BAD PRACTISE
        List myList = new ArrayList(); // ArrayList of supertype Object
        myList.add("Some text");
        myList.add(5);
//        myList.set(1, "Text"); // the code will throw an exception because can not put String into Integer
        String someTextVariable = (String) myList.get(0);
        Integer someIntVariable = (Integer) myList.get(1);

        // Equals to this GOOD PRACTISE
        List<String> myListSecond = new ArrayList<>();
//        String someTextVariableSecond = myListSecond.get(0); // will be an error because myListSecond is empty

        List<Object> myObject = new ArrayList<>();
    }
}
