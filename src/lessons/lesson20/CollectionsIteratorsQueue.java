package lessons.lesson20;

import java.util.*;

public class CollectionsIteratorsQueue {

    public static void main(String[] args) {

        List<String> planets = new ArrayList<>();

        planets.add("Earth");
        planets.add("Venus");
        planets.add("Mars");

        Iterator planetIterator = planets.iterator();

        while (planetIterator.hasNext()){
            System.out.println(planetIterator.next());
        }

        Set<String> birds = new TreeSet<>(); // TreeSet arrange elements in alphabetical order

        birds.add("Parrot");
        birds.add("Eagle");
        birds.add("Sparrow");
        birds.add("Pigeon");

        Iterator birdsIterator = birds.iterator();

        while (birdsIterator.hasNext()){
            System.out.println(birdsIterator.next());
        }

        Queue<String> lidl = new LinkedList<>();

        lidl.add("A");
        lidl.add("B");
        lidl.add("C");

        System.out.println(lidl); // printing [A, B, C]

        Iterator lidlIterator = lidl.iterator();

        while (lidlIterator.hasNext()){
            System.out.println(lidlIterator.next()); // printing one by one, every letter on next line
        }
    }
}
