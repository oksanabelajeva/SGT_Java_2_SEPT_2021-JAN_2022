package lessons.lesson20;

import java.util.ArrayList;
import java.util.List;

public class CollectionsLists {

    public static void main(String[] args) {

        List<String> streets = new ArrayList<>();

        streets.add("Salacas");
        streets.get(0); // Salacas
        streets.add("Maskavas"); // index 1
        streets.set(0, "Olivu");
        System.out.println(streets);

        streets.addAll(streets);
        System.out.println(streets);
    }
}
