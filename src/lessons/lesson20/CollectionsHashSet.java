package lessons.lesson20;

import java.util.HashSet;
import java.util.Set;

public class CollectionsHashSet {

    public static void main(String[] args) {

        Set<Integer> houseNumbers = new HashSet<>();
        houseNumbers.add(1);
        houseNumbers.add(5);
        houseNumbers.add(50);
        houseNumbers.add(15);
        houseNumbers.add(15); //

        System.out.println(houseNumbers);
    }
}
