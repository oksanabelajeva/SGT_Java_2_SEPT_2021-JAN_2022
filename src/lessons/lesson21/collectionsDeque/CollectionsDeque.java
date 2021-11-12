package lessons.lesson21.collectionsDeque;

import java.util.*;

public class CollectionsDeque {

    public static void main(String[] args) {
        Deque<String> myDeque = new ArrayDeque();

        myDeque.addFirst("1");
        myDeque.addFirst("2");
        myDeque.addFirst("3");

        //I want to get 3
        String removedElement = myDeque.removeFirst();
        System.out.println(removedElement);

        //I want to get 2
        removedElement = myDeque.removeFirst();
        System.out.println(removedElement);

        myDeque.addFirst("4");

        //I want to get 1
        removedElement = myDeque.removeLast();
        System.out.println(removedElement);

        List<CustomObject> myList = new ArrayList();
        CustomObject customObject1 = new CustomObject();
        customObject1.setId(1);

        CustomObject customObject2 = new CustomObject();
        customObject2.setId(2);

        myList.add(customObject1);
        myList.add(customObject2);

        Iterator mlIterator = myList.iterator();

        while (mlIterator.hasNext()){
            System.out.println(mlIterator.next());
        }

        String pet1 = "parrot";
        String pet2 = "penguin";
        String pet3 = pet1;

        if (pet1 == pet2){
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

        if (pet1.equals(pet2)){
            System.out.println("OK equals");
        } else {
            System.out.println("Not OK equals");
        }
    }
}
